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
import model.Customer;

/**
 *
 * @author Quynh
 */
public class CustomerDAO {

    public static Customer getCustomer(String customerID, String password) {
        String sql = "select * from CustomerTBL where customerID = ? and Password = ?";
        Customer cus = null;
        try (Connection conn = DBConfig.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, customerID);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cus = new Customer(rs.getString("CustomerID"), rs.getString("CustomerName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cus;
    }
}
