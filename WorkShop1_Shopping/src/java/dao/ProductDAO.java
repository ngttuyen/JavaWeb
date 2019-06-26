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
import java.util.ArrayList;
import model.OrderLine;

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

//    public static boolean insertOrder(OrderLine or) {
//        String insert = "insert into OrderLine values(?,?,?)";
//        try (Connection conn = DBConfig.getConnection()) {
//            PreparedStatement ps = conn.prepareStatement(insert);
//            ps.setString(1, Integer.toString(or.getQuantity()));
//            //ps.setString(2, );
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}
