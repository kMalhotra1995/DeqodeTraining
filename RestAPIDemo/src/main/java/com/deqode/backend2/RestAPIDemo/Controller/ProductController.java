package com.deqode.backend2.RestAPIDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deqode.backend2.RestAPIDemo.Model.Product;
import com.deqode.backend2.RestAPIDemo.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value="/product")
	public List<Product> getProduct(){
		List<Product> products=productService.findAll();
		return products;
	}

}
