package com.method.instance;

public class Product {
	public String productName;
	public int productId;
	public double productPrice;

	public void addProductDetails(String name, int id, double price) {
		productName = name;
		productId = id;
		productPrice = price;
	}

	public String displayDetails() {
		return "Product Name : " + productName + "\nProduct Id : " + 
				productId + "\nProduct Price : " + productPrice + " Rupees";
	}

	public static void main(String[] args) {
		Product prod = new Product();
		prod.addProductDetails("Pen", 637, 5.0);
		System.out.println(prod.displayDetails());

	}
}
