package com.example.model;

import java.util.List;

public class Cart {

    private List<Product> listProducts;
    private  Customer customer;

    public List<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Cart(List<Product> listProducts, Customer customer) {
        this.listProducts = listProducts;
        this.customer = customer;
    }
}




	/* @Override public boolean equals(Object other) {
	    boolean result = false;
	    if (other instanceof Reservation) {
	        Reservation that = (Reservation) other;
	        result =
	        (this.date_in == that.getDate_in() && this.date_out == that.date_out
	        && this.id == that.getId()
	        && this.guest.equals(that.guest)
	        && this.room.equals(that.room));
	    } */