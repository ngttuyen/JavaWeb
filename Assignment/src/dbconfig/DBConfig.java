package dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	public static Connection getConnection() {
		String url ="";
		String username = "";
		String password = "";
		Connection con = null;
		try {
			Class.forName("! Your database driver!");
			con = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
