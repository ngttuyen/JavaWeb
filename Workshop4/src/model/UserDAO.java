package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	public static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = 
					DriverManager.getConnection(
							"jdbc:sqlserver://DESKTOP-EUBI85S\\DUONGDO990:1433;"
									+ "databaseName=User","sa","duong");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static User checkLogin(String username,String password) {
		String sql = "select * from Account where Username = ? and Password = ?";
		User u = null;
		try {
			Connection cc = getConnection();
			PreparedStatement ps  = cc.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String name = rs.getString("Name");
				u = new User(name);
			}
			return u;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
