package com.example.test;

import com.example.dao.IOrderDao;
import com.example.dao.IPaymentDao;
import com.example.model.*;
import com.example.service.CartService;
import com.example.service.PaymentService;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class PaymentServiceTest {

    @Test
   // @org.junit.Test
    public void addPayment() {
        Date date=new Date();
        List<Product> listProducts = new ArrayList<Product>();
        Customer customer=new Customer(1L,"larbi","maya");
        Product produit =new Product("1","chargeur","sumsung",2, 4L);
        listProducts.add(produit);
        Cart cart =new Cart(listProducts,customer);

 //-----------
        IOrderDao mokitorder=Mockito.mock(IOrderDao.class);
        Order order=new Order(1L,cart,date);

        //---------------
        IPaymentDao mokitopay = Mockito.mock(IPaymentDao.class);
        Payment payment=new Payment(1L,order,8L,date);
        Mockito.when(mokitopay.addPayment(payment)).thenReturn(true);

        PaymentService payservice= new PaymentService(mokitorder,mokitopay);
        //assertTrue(payservice.addPayment(payment));
        assertEquals(true,payservice.addPayment(payment));

    }
}