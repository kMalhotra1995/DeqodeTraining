package com.deqode.backend2.RestAPIDemo.Model;

public class Product {
	private int id;
	private String pname;
	private double price;
	private int noOfProduct;
	
	public Product()
	{
		
	}

	public Product(int id, String pname, double price, int noOfProduct) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
		this.noOfProduct = noOfProduct;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfProduct() {
		return noOfProduct;
	}

	public void setNoOfProduct(int noOfProduct) {
		this.noOfProduct = noOfProduct;
	}
	
	

}
