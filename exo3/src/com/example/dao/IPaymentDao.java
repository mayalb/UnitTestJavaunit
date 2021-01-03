package com.example.dao;

import com.example.model.Payment;

public interface IPaymentDao {

    boolean addPayment(Payment payment);
    Payment getPayment (Long id);

}

