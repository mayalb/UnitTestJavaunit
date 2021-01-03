package com.example.model;

import java.util.Date;

public class Payment {

    private long id;
    private Order order;
    private long amount;
    private Date date;


    public Payment(long id, Order order, long amount, Date date) {
        this.id = id;
        this.order = order;
        this.amount = amount;
        this.date = date;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
