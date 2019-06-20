/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static dao.ProductDAO.getAllProduct;
import java.util.ArrayList;

/**
 *
 * @author Quynh
 */
public class OrderLine {
    private int quantity;

    static ArrayList<Product> bList = new ArrayList<Product>();
    
    public static ArrayList<Product> getAll(){
        return bList;
    }

    public OrderLine(String productID) {
        bList.add(getProduct(productID));
    }

    public static Product getProduct(String productID) {
        Product p = null;
        for (int i = 0; i < getAllProduct().size(); i++) {
            if ((getAllProduct().get(i).getProductID()).equalsIgnoreCase(productID)) {
                p = getAllProduct().get(i);
            }
        }
        return p;
    }

}
