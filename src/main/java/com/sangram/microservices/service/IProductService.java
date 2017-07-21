package com.sangram.microservices.service;

import java.util.List;

import com.sangram.microservices.model.Product;

public interface IProductService {

	List<Product> listAllProducts();
	List<Product> listAllProductsByType(String type);
	boolean addProduct(Product product);
	void removeProduct(long id);
	Product findById(long id);
}
