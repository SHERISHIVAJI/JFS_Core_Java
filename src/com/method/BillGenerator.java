package com.method;

public class BillGenerator {
	
	public static void totalBill(String itemName, int quantity, float price) {
		System.out.println("Item You have Ordered: " + itemName);
		System.out.println("Number of " + itemName + " you have ordered: " + quantity);
		System.out.println("Price of every single " + itemName + " is: " + price);
		System.out.println("The total bill: " + quantity * price);
	}

	public static void main(String[] args) {
		totalBill("Mandi", 3, 279);
	}

}
