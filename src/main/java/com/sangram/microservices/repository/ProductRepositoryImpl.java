package com.sangram.microservices.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.sangram.microservices.model.Product;

@Repository
public class ProductRepositoryImpl implements IProductRepository{

	private static List<Product> products = new ArrayList<Product>();
	static int counter = 0;
	static {
		products.add(new Product(counter++, "Bat", "Sport", "MRF Bat"));
		products.add(new Product(counter++, "Ball", "Sport", "cosco"));
		products.add(new Product(counter++, "Shirt", "Garment", "Cotton Shirts"));
		products.add(new Product(counter++, "Jeans", "Garment", "Denim Jeans"));
	}

	@Override
	public List<Product> listAllProducts() {
		return products;
	}

	@Override
	public List<Product> listAllProductsByType(String type) {
		return products.stream().filter(p -> p.getType().equalsIgnoreCase(type)).collect(Collectors.toList());
	}

	@Override
	public boolean addProduct(Product product) {
		product.setId(counter++);
		return products.add(product);
	}

	@Override
	public void removeProduct(long id) {
		for (Iterator<Product> iterator = products.iterator(); iterator.hasNext(); ) {
			Product product = iterator.next();
			if (product.getId() == id) {
				iterator.remove();
			}
		}
	}
	@Override
	public Product findById(long id) {
		for(Product product : products){
			if(product.getId() == id){
				return product;
			}
		}
		return null;
	}

}
