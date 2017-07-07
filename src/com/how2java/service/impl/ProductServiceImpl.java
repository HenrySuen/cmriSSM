package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.ProductMapper;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductMapper productMapper;
	
	@Override
	public void addProduct(Product product, String cid) {
		// TODO Auto-generated method stub
		productMapper.addProduct(product, cid);
	}

	@Override
	public void deleteProduct(String id) {
		// TODO Auto-generated method stub
		productMapper.deleteProduct(id);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productMapper.updateProduct(product);
	}

	@Override
	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return productMapper.listProducts();
	}

}
