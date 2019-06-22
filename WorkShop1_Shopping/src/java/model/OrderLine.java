/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static dao.ProductDAO.getAllProduct;
import java.util.HashMap;

/**
 *
 * @author Quynh
 */
public class OrderLine {

    static HashMap<String, OrderLine> buyerList;

    private int quantity, price;

    public OrderLine() {
        buyerList = new HashMap<String, OrderLine>();
    }

    public OrderLine(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static HashMap<String, OrderLine> getMap() {
        return buyerList;
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

    public static void adddProduct(int productID) {
        Product p = getProduct(productID);
        OrderLine or = null;
        int quantity = 1;
        if (buyerList.containsKey(p.getProductName())) {
            or = (OrderLine) buyerList.get(p.getProductName());
            or.setQuantity(or.getQuantity() + 1);
            or.setPrice(or.getPrice() + p.getProductPrice());
            buyerList.replace(p.getProductName(), or);
        } else {
            or = new OrderLine(quantity, p.getProductPrice());
            buyerList.put(p.getProductName(), or);
        }
    }

    public static String getCard() {
        String productName = "";
        int quantity = 0;
        int price = 0;
        for (String name : buyerList.keySet()) {
            productName = name;
            quantity = buyerList.get(name).getQuantity();
            price = buyerList.get(name).getPrice();
        }
        return productName + " " + price + " " + quantity;
    }
    public static void main(String[] args) {
        OrderLine oo = new OrderLine();
        oo.adddProduct(1);
        oo.adddProduct(2);
        oo.adddProduct(3);
        oo.adddProduct(4);
        
    }
}
