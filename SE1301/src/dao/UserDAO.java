package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;

public class UserDAO extends User {
	public static Connection conn = null;
	public static PreparedStatement ps=null;
	public static ResultSet rs=null;
	public static final String select = "select * from Users where UserID=? and Password=?";
	public static final String update = "update Users set Password=? where UserID=?";
	public static final String delete = "delete from Users where UserID=? and Password=?";
	public static boolean login(String username,String password) {
		boolean st=false;
		try {
			conn = DataBaseConfig.getConnection("DESKTOP-EUBI85S\\DUONGDO990", "FULib", "sa", "duong");
			ps = conn.prepareStatement(select);
			ps.setString(1, username);
			ps.setString(2, password);
			rs =ps.executeQuery();
			st = rs.next();
			getProfile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st;
	}
	
	public static User getProfile() {
		try {
			rs =ps.executeQuery();
			while(rs.next()) {
				User.setUserID(rs.getString("UserID"));
				User.setFullName(rs.getString("FullName"));
				User.setEmail(rs.getString("Email"));
				User.setStatus(rs.getString("Status"));
				User.setUserRight( rs.getInt("UserRight"));
				User.setPassword(rs.getString("Password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void changePassword(String pw) {
		try {
			ps = conn.prepareStatement(update);
			ps.setString(1, pw);
			ps.setString(2, User.getUserID());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteAccount(String pw) {
		try {
			ps = conn.prepareStatement(delete);
			ps.setString(1, User.getUserID());
			ps.setString(2, pw);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
	}
	
}
