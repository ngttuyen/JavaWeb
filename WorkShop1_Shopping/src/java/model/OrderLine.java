/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static dao.ProductDAO.getAllProduct;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Quynh
 */
public class OrderLine {

    private int orderID, quantity, price;

    public OrderLine(int orderID, int quantity, int price) {

        this.orderID = orderID;
        this.quantity = quantity;
        this.price = price;
    }

    static HashMap<String, ArrayList<OrderLine>> bList = new HashMap<String, ArrayList<OrderLine>>();

    public static HashMap<String, ArrayList<OrderLine>> getAll() {
        return bList;
    }

    public OrderLine(String productID) {

    }

    public static Product getProduct(int productID) {
        Product p = null;
        for (int i = 0; i < getAllProduct().size(); i++) {
            if ((getAllProduct().get(i)).getProductID() == productID) {
                p = getAllProduct().get(i);
            }
        }
        return p;
    }

}
