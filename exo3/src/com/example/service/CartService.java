package com.example.service;


import com.example.dao.ICartDao;
import com.example.dao.IProductDao;
import com.example.model.Cart;
import com.example.model.Customer;
import com.example.model.Product;


public class CartService {
	
	private IProductDao iProductDao;
	private ICartDao iCartDao;


	public boolean addProductToCart(Product product, Customer customer) {
		int qteStock = iProductDao.getProductQte(product);
		if(product.getQte()<=qteStock){
			return iCartDao.addProductToCart(product,customer);
		}
		return false;
	}

	public Cart getCart(Customer customer){
		return iCartDao.getCart(customer);
	}


	public CartService(IProductDao iProductDao, ICartDao iCartDao) {
		this.iProductDao = iProductDao;
		this.iCartDao = iCartDao;
	}
}
	

