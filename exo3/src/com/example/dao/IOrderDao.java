package com.example.dao;

import com.example.model.Order;

public interface  IOrderDao {

    boolean addOrder (Order order);
    Order getOrder (Long id);

}
