/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import model.Product;
import dbconfig.DBConfig;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author Quynh
 */
public class ProductDAO {

    public static HashMap<String, Product> getAllProduct() {
        String sql = "select * from Product";
        HashMap<String, Product> pList = new HashMap<>();
        Product p = null;
        try (Connection conn = DBConfig.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String productID = rs.getString("ProductID");
                p = new Product(rs.getString("ProductName"),
                        rs.getInt("ProductPrice"));
                pList.put(productID, p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pList;
    }

    public static Product getProduct(HashMap map,String productID) {
        Product p = null;
        if(map.containsKey(productID)){
            p = (Product) map.get(productID);
        }
        return p;
    }            
}
