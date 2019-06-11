package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dbconfig.DBConfig;

public class UserDAO {
	public Users login(String username,String password) {
		String sql = "select * from //Database where UserName=? and Password=?";
		Users u = null;
		try (Connection c = DBConfig.getConnection()){
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("UserID");
				int age = rs.getInt("Age");
				int UserRight = rs.getInt("UserRight");
				String UserName = rs.getString("UserName");
				String Password = rs.getString("Password");
				String FullName = rs.getString("FullName");
				String Gender = rs.getString("Gender");
				String Email = rs.getString("Email");
				String WID = rs.getString("WID");
				String Status = rs.getString("Status");
				String Avatar = rs.getString("Avatar");
				u = new Users(id, age, UserRight, UserName, 
						Password, FullName, Gender, 
						Email, WID, Status, Avatar);
			}
			ps.close();
			rs.close();
			return u;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
//	public boolean register() {
////		private int Age
////		private String UserName,Password,FullName,Gender,Email,Avatar;
//		String sql = "insert into //Database values(?,?,?,?,?,?,?)";
//		try (Connection c = DBConfig.getConnection()){
//			PreparedStatement ps = c.prepareStatement(sql);
//			ps.setInt(1, x);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//}
