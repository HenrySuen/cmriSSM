package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;

@Controller
@RequestMapping("")
public class CategoryController {

	 @Autowired
	 CategoryService categoryService;
	 
	 @RequestMapping("/listCategory")
	 public ModelAndView listCategory(){
	     ModelAndView mAv = new ModelAndView();
	     List<Category> categories = categoryService.list();
	         
	     // 放入转发参数
	     mAv.addObject("categories", categories);
	     // 放入jsp路径
	     mAv.setViewName("listCategory");
	     return mAv;
	 }
	 
	 @RequestMapping("/deleteCat")
	 public ModelAndView deleteCat(@RequestParam("id") String id){
		 categoryService.delete(id);
		 ModelAndView mAv = new ModelAndView("redirect:/listCategory");
		 return mAv;
	 }
	 
	 @RequestMapping("/toAddCat")
	 public ModelAndView toAddCat(){
		 return new ModelAndView("addCategory");
	 }
	 
	 @RequestMapping("/addCategory")
	 public ModelAndView addCategory(Category category){
		 // Spring MVC 会用反射自己生成model??天呐
//		 Category category = new Category();
//		 category.setName(name);
		 categoryService.add(category);
		 ModelAndView mAv = new ModelAndView("redirect:/listCategory");
		 return mAv;
	 }
	 
	 @RequestMapping("/toUpCat")
	 public ModelAndView toUpCat(@RequestParam("id") String id){
		 ModelAndView mAv = new ModelAndView();
		 mAv.addObject("category", categoryService.preUpdate(id));
		 mAv.setViewName("updateCategory");
		 return mAv;
	 }
	 
	 @RequestMapping("/updateCategory")
	 public ModelAndView updateCategory(Category category){
//		 Category category = new Category();
//		 category.setId(Integer.parseInt(id));
//		 category.setName(name);
		 categoryService.update(category);
		 return new ModelAndView("redirect:/listCategory");
	 }
	 
	 @RequestMapping("/listByName")
	 public ModelAndView listByName(@RequestParam("name") String name){
		 ModelAndView mAv = new ModelAndView();
		 mAv.addObject("categories", categoryService.listByName(name));
		 mAv.setViewName("listCategory");
		 return mAv;
	 }
	 
	 @RequestMapping("/listCatProduct")
	 public ModelAndView listCatProduct(@RequestParam("id") String id){
		 ModelAndView mAv = new ModelAndView("listCatProduct");
		 mAv.addObject("cat", categoryService.listProductByCatId(id));
		 // 要get一下放在model里？？
		 mAv.addObject("products", categoryService.listProductByCatId(id).getProducts());
		 return mAv;
	 }
}
