package com.method.instance;

public class Mobile {
	public static String storeName;
	public String brand;
	public int price;
	
	public void showDetails() {
		System.out.println("Store Name : " + storeName);
		System.out.println("Mobile Brand : " + brand);
		System.out.println("Mobile Price : " + price);
		System.out.println("-------------------------------");
	}
	
	public static void main(String[] args) {
		storeName = "Tech World";
		Mobile m1 = new Mobile();
		m1.brand = "Apple";
		m1.price = 1200;
		m1.showDetails();
		
		Mobile m2 = new Mobile();
		m2.brand = "Samsung";
		m2.price = 900;
		m2.showDetails();
	}
}
