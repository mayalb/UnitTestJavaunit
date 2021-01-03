package com.example.test;

import com.example.dao.ICartDao;
import com.example.dao.IProductDao;
import com.example.model.Cart;
import com.example.model.Customer;
import com.example.model.Product;
import com.example.service.CartService;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CartServiceTest {

    @org.junit.Test
    public void addProductToCart() {
         List<Product> listProducts = new ArrayList<>();
         Customer customer=new Customer(1L,"larbi","maya");
        //mok pour iProductDao
        IProductDao mocproduct= Mockito.mock(IProductDao.class);
        Product produit =new Product("1","chargeur","sumsung",2, 900L);
        Mockito.when(mocproduct.getProductQte(produit)).thenReturn(produit.getQte());

         listProducts.add(produit);
        //mok pour iCartDao
        ICartDao moccart =Mockito.mock(ICartDao.class);
        Cart cart =new Cart(listProducts,customer);
        Mockito.when(moccart.addProductToCart(produit,customer)).thenReturn(true);
        //-----
        CartService cartservice =new CartService(mocproduct,moccart);
        assertEquals(true,cartservice.addProductToCart(produit,customer));
    }
}