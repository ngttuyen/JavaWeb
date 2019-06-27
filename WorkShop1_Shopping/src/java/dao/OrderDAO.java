/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import dbconfig.DBConfig;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author quynh
 */
public class OrderDAO {

    public static int getOrderID(String customerID) {
        String sql = "select OrderID from OrderTBL where CustomerID = ?";
        try (Connection conn = DBConfig.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, customerID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("OrderID");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
