package com.blcelc;

public class Product {
	public int productId;
	public String productName;
	public double price;
	public int quantity;
	
	public void setProductId(int id) {
		productId = id;
	}
	
	public void setProductName(String name) {
		productName = name;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public void setQuantity(int q) {
		quantity = q;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
}
