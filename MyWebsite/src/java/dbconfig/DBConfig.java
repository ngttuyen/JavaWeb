/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author meo
 */
public class DBConfig {

    public static Connection getConnection() {
        String username = "sa";
        String password = "duong";
        String url = "jdbc:sqlserver://localhost:5050;databaseName=BookShop";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
