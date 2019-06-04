package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Member;

public class MemberDAO {
	static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	public static Member login(String username,String password) {
		String select = "select * from Member where Username = ? and Password = ?";
		Member m = null;
		try (Connection con = DBConfig.getConnection()){
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String uid = rs.getString(2);
				String pw = rs.getString(3);
				String email = rs.getString(4);
				String fullName = rs.getString(5);
				String address = rs.getString(6);
				String phone = rs.getString(7);
				boolean gender = rs.getBoolean(8);
				Date dob = rs.getDate(9);
				m = new Member(id, uid, pw, email, fullName, address, phone, gender, dob);
			}
			rs.close();
			con.close();
			return m;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static boolean signUp(String name,String email,String username,String password,boolean gender,Date date) {
		String insert = "insert into Member values(?,?,?,?,?,?,?,?)";
		Member m =null;
		try (Connection con = DBConfig.getConnection()){
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setString(4, name);
			ps.setString(5, null);
			ps.setString(6, null);
			ps.setString(7, Boolean.toString(gender));
			ps.setString(8, sdf.format(date));
			ps.executeUpdate();
			ps.close();
			con.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
