package dao;

import dbconfig.DBConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import utils.MD5;

import model.User;

public class UserDAO {

    private static final String getUsrSt = "select * from USERS where UserName = ? and PassWord = ?";
    private static final String insUserSt = "insert into USERS(UserName,PassWord,Email,Status) values(?,?,?,'False')";
    private static final String getAvtSt = "select * from USERS where UserName = ?";
    private static final String findUsername = "select UserName from USERS where Username = ?";
    private static final String findEmail = "select Email from USERS where Email=?";
    private static final String update = "update USERS set FullName = ? ,Age = ? ,"
            + "Gender = ? ,Status = True ,UserRight = 3 where UserName = ?";
    private static final String checkInfo = "select UserName from USERS where Status = 'True'";

    public static boolean checkInfo(String username) {
        try (Connection conn = DBConfig.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(checkInfo);
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean updateUserInfo(User usr) {
        try (Connection conn = DBConfig.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, usr.getFullName());
            ps.setString(2, Integer.toString(usr.getAge()));
            ps.setString(3, usr.getGender());
            ps.setString(4, usr.getUserName());
            int result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean checkUsersName(String UserName) {

        try (Connection conn = DBConfig.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(findUsername);
            ps.setString(1, UserName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean checkEmail(String Email) {

        try (Connection conn = DBConfig.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(findEmail);
            ps.setString(1, Email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    // Đăng kí User

    public static User register(String username, String password, String email) {
        User u = null;
        try (Connection con = DBConfig.getConnection()) {
            PreparedStatement ps = con.prepareStatement(insUserSt);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            int result = ps.executeUpdate();
            if (result > 0) {
                u = new User(username, password, email);
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }
    // Kiểm tra thông tin đăng nhập

    public static User checkLogin(String username, String password) {
        return getProfile(username, password);
    }
    // Lấy toàn bộ thông tin User sau khi đã đăng nhập

    public static User getProfile(String username, String password) {
        User u = null;
        try (Connection conn = DBConfig.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(getUsrSt);
            ps.setString(1, username);
            ps.setString(2, MD5.getMd5(password));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u = new User(rs.getString("UserName"),
                        rs.getString("FullName"),
                        rs.getString("Gender"),
                        rs.getString("Email"),
                        rs.getInt("UID"),
                        rs.getInt("Age"));
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

    // Lấy Avatar User
    public static byte[] getUserAvatar(String username) {
        try (Connection conn = DBConfig.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(getAvtSt);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getBytes("Avatar");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(checkInfo("abc"));
    }
}