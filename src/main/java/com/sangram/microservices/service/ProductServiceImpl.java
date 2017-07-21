package com.sangram.microservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangram.microservices.model.Product;
import com.sangram.microservices.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductRepository productRepository;
	
	@Override
	public List<Product> listAllProducts() {
		return productRepository.listAllProducts();
	}

	@Override
	public List<Product> listAllProductsByType(String type) {
		return productRepository.listAllProductsByType(type);
	}

	@Override
	public boolean addProduct(Product product) {
		return productRepository.addProduct(product);
	}

	@Override
	public void removeProduct(long id) {
		productRepository.removeProduct(id);
	}

	@Override
	public Product findById(long id) {
		return productRepository.findById(id);
	}

}
