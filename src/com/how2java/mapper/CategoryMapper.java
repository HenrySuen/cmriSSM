package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Category;

public interface CategoryMapper {
	  
    public void add(Category category);  
        
    public void delete(String id);  
        
    public List<Category> get(String id);  
      
    public void update(Category category);   
        
    public List<Category> list();
     
    public int count();  
    
    public Category listByName(String name);
    
    public Category listCatProduct(String id);
		
}
