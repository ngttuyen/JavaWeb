package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433;databaseName=BookStore","sa","duong");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
