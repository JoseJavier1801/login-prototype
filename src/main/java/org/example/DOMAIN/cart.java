package org.example.DOMAIN;

import java.util.Date;

public class cart {
    private int id_user;
    private int id_produt;

    private Date buyDate;

    private String productName;

    private int cant;
    private double price;

    public cart(int id_user, int id_produt, Date buyDate, String productName, int cant, double price) {
        this.id_user = id_user;
        this.id_produt = id_produt;
        this.buyDate = buyDate;
        this.productName = productName;
        this.cant = cant;
        this.price = price;
    }

    public cart() {
        this(0,0,new Date()," ", 0,0);
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_produt() {
        return id_produt;
    }

    public void setId_produt(int id_produt) {
        this.id_produt = id_produt;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buydate) {
        this.buyDate = buydate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "cart{" +
                "id_user=" + id_user +
                ", id_produt=" + id_produt +
                ", buyDate=" + buyDate +
                ", productName='" + productName + '\'' +
                ", cant=" + cant +
                ", price=" + price +
                '}';
    }
}
