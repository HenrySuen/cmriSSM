package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Product;

public interface ProductMapper {
	
	public void addProduct(Product product, String cid);

	public void deleteProduct(String id);
	
	public void updateProduct(Product product);
	
	public List<Product> listProducts(); 
}
