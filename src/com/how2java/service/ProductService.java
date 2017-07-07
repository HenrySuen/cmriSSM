package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Product;

public interface ProductService {

	void addProduct(Product product, String cid);
	
	void deleteProduct(String id);
	
	void updateProduct(Product product);
	
	List<Product> listProducts();
}
