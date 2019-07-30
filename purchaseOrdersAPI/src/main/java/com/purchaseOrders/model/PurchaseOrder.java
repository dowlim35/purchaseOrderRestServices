package com.purchaseOrders.model;

import java.util.Date;

public class PurchaseOrder {
    private String supplierName;
    private String itemName;
    private int quantity;
    private String currency;
    private Date dates;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public PurchaseOrder(String supplierName, String itemName, int quantity, String currency, Date dates, double price) {
        this.supplierName = supplierName;
        this.itemName = itemName;
        this.quantity = quantity;
        this.currency = currency;
        this.dates = dates;
        this.price = price;
    }
}
