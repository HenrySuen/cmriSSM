package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Category;

public interface CategoryService {
	 List<Category> list();
	 
	 void delete(String id);
	 
	 void add(Category category);
	 
	 List<Category> preUpdate(String id);
	 
	 void update(Category category);
	 
	 Category listByName(String name);
	 
	 Category listProductByCatId(String id);
	 
	 List<Category> get(String id);
}
