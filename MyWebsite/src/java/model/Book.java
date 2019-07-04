/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author meo
 */
public class Book {

    private String bookName, category, bookIMG;
    private int bookPrice, quantity;

    public Book(String bookName, String category, String bookIMG, int bookPrice, int quantity) {
        this.bookName = bookName;
        this.category = category;
        this.bookIMG = bookIMG;
        this.bookPrice = bookPrice;
        this.quantity = quantity;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBookIMG() {
        return bookIMG;
    }

    public void setBookIMG(String bookIMG) {
        this.bookIMG = bookIMG;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
