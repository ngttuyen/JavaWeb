/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import model.Product;
import dbconfig.DBConfig;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Quynh
 */
public class ProductDAO {

    public static ArrayList<Product> getAllProduct() {
        String sql = "select * from ProductTBL";
        ArrayList<Product> pList = new ArrayList<>();
        Product p = null;
        try (Connection conn = DBConfig.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                p = new Product(rs.getString(2), rs.getInt(1),
                        rs.getInt(3));
                pList.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pList;
    }

    public static boolean insertOrder(String date, String method, String customerID) {
        String insert = "insert into OrderTBL values(?,?,?)";
        try (Connection conn = DBConfig.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, date);
            ps.setString(2, method);
            ps.setString(3, customerID);
            int x = ps.executeUpdate();
            if (x > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean insertOrderLine(int orderID, int productID, int quantity, int price) {
        String insert = "insert into OrderLineTBL values(?,?,?,?)";
        try (Connection conn = DBConfig.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, Integer.toString(orderID));
            ps.setString(2, Integer.toString(productID));
            ps.setString(3, Integer.toString(quantity));
            ps.setString(4, Integer.toString(price));
            int x = ps.executeUpdate();
            if (x > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static int getProductID(String productName) {
        String sql = "select ProductID from ProductTBL where ProductName = ?";
        try (Connection conn = DBConfig.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, productName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("ProductID");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
