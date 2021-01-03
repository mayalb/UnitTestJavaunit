package com.example.dao;

import com.example.model.Cart;
import com.example.model.Customer;
import com.example.model.Product;


public interface ICartDao{

    boolean addProductToCart(Product product,Customer customer);

	Cart getCart(Customer customer);
}
