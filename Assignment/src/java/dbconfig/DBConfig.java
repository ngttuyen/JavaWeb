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
 * @author quynh
 */
public class DBConfig {
    public static Connection getConnection(){
        String username ="sa";
        String pw = "duong";
        String url ="jdbc:sqlserver://localhost:5050;databaseName=CRUSH";
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url,username,pw);
        } catch (Exception e) {
        }
        return conn;
    }
}
