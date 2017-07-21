package com.sangram.microservices.repository;

import java.util.List;

import com.sangram.microservices.model.Product;

public interface IProductRepository {

	List<Product> listAllProducts();
	List<Product> listAllProductsByType(String type);
	boolean addProduct(Product product);
	void removeProduct(long id);
	Product findById(long id);
}
