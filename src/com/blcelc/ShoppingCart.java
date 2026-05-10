package com.blcelc;

public class ShoppingCart {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductId(101);
		p1.setProductName("Laptop");
		p1.setPrice(55000.50);
		p1.setQuantity(5);
		
		Product p2 = new Product();
		p2.setProductId(102);
		p2.setProductName("Smartphone");
		p2.setPrice(22850.00);
		p2.setQuantity(10);
		
		p1.setQuantity(8);
		
		System.out.println("------------------PRODUCT 1-----------------------");
		System.out.println("Product Id : " + p1.getProductId());
		System.out.println("Product Name : " + p1.getProductName());
		System.out.println("Price : " + p1.getPrice());
		System.out.println("Quantity : " + p1.getQuantity());
		
		System.out.println("------------------PRODUCT 2------------------------");
		System.out.println("Product Id : " + p2.getProductId());
		System.out.println("Product Name : " + p2.getProductName());
		System.out.println("Price : " + p2.getPrice());
		System.out.println("Quantity : " + p2.getQuantity());
	}
}
