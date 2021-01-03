package com.example.service;

import com.example.dao.IOrderDao;
import com.example.dao.IPaymentDao;
import com.example.model.Order;
import com.example.model.Payment;
import com.example.model.Product;

import java.util.List;

public class PaymentService {

    private IOrderDao iOrderDao;
    private IPaymentDao iPaymentDao;

    public PaymentService(IOrderDao iOrderDao, IPaymentDao iPaymentDao) {
        this.iOrderDao = iOrderDao;
        this.iPaymentDao = iPaymentDao;
    }

    public boolean addPayment(Payment payment){
        long totalOrderPrice = 0;
        Order order = payment.getOrder();
        List<Product> listProduct = order.getCart().getListProducts();
        for(int i=0;i<listProduct.size();i++){
            totalOrderPrice = totalOrderPrice + listProduct.get(i).getPrice()*listProduct.get(i).getQte();
        }
        if(payment.getAmount()==totalOrderPrice){
            return  iPaymentDao.addPayment(payment);
        }
        return  false;

    }

}
