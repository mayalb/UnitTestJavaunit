package com.example.model;

import java.util.Date;

public class Order {

    private long id;
    private Cart cart;
    private Date date;


    public Order(long id, Cart cart, Date date) {
        this.id = id;
        this.cart = cart;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
