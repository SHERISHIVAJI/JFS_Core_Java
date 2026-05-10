package com.method;

public class Product {
	String productName;
	int productId;
	double productPrice;
	
	public void addProductDetails(String name, int id, double price) {
		productName = name;
		productId = id;
		productPrice = price;
	}
	
	public String displayDetails() {
		return "Product Name : " + productName + "\nProduct Id : " + productId + "\nProduct Price : " + productPrice;
	}

	public static void main(String[] args) {
		Product prod = new Product();
		prod.addProductDetails("Pen", 637, 5.0);
		System.out.println(prod.displayDetails());

	}

}