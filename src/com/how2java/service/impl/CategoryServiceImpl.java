package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryMapper categoryMapper;
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categoryMapper.list();
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		categoryMapper.delete(id);
	}

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		categoryMapper.add(category);
		
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		categoryMapper.update(category);
	}

	@Override
	public Category listByName(String name) {
		// TODO Auto-generated method stub
		return categoryMapper.listByName(name);
	}

	@Override
	public Category listProductByCatId(String id) {
		// TODO Auto-generated method stub
		return categoryMapper.listCatProduct(id);
	}

	@Override
	public List<Category> preUpdate(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> get(String id) {
		// TODO Auto-generated method stub
		return categoryMapper.get(id);
	}

}
