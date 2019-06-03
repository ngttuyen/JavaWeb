package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConfig {
	public static Connection getConnection(String url,String DBName,String username,String password) {
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection
					("jdbc:sqlserver://"+url+":4343;databaseName="+DBName,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
