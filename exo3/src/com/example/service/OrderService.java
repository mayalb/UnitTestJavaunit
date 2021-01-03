package com.example.service;

import com.example.dao.IOrderDao;
import com.example.model.Order;

public class OrderService {

    private IOrderDao iOrderDao;

    public boolean addOrder(Order order) {
        return  iOrderDao.addOrder(order);
    }
}
