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
 * @author Duong
 */
public class DBConfig {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
