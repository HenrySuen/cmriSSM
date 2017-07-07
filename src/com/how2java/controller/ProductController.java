package com.how2java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.CategoryService;
import com.how2java.service.ProductService;

@Controller
@RequestMapping("")
public class ProductController {
	
	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("/listProduct")
	public ModelAndView listProduct(){
		ModelAndView mAv = new ModelAndView("listProducts");
		mAv.addObject("products", productService.listProducts());
		return mAv;
	}
	
	@RequestMapping("/toAddProduct")
	// 添加到当前目录下
	public ModelAndView toAddProduct(@RequestParam("cid") String cid){
		ModelAndView mAv = new ModelAndView("addProduct");
		mAv.addObject("categories", categoryService.get(cid));
		return mAv;
	}
	
	@RequestMapping("/addProduct")
	public ModelAndView addProduct(Product product){
		productService.addProduct(product,"1");
		return new ModelAndView("redirect:/listCategory");
	}
}
