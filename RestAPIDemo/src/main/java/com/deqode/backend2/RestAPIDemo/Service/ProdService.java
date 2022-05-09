package com.deqode.backend2.RestAPIDemo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.deqode.backend2.RestAPIDemo.Model.Product;

@Service
public class ProdService implements ProductService{

	@Override
	public List<Product> findAll() {
		
		ArrayList<Product> prod=new ArrayList<Product>();
		prod.add(new Product(100, "Mobile", 9000.00, 6));  
		prod.add(new Product(101, "Smart TV", 60000.00, 3));  
		prod.add(new Product(102, "Washing Machine", 9000.00, 7));  
		prod.add(new Product(103, "Laptop", 24000.00, 1));  
		prod.add(new Product(104, "Air Conditioner", 30000.00, 5));  
		prod.add(new Product(105, "Refrigerator ", 10000.00, 4)); 
		
		
		return prod;
	}

	
}
