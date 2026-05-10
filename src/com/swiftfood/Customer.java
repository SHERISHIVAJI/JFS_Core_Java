package com.swiftfood;

public class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
	}
	
	
	public double payBill(double totalPrice, double discountPercentage) {
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
//		System.out.println("Hi " + customerName + ", your final bill amount after discount is: " + (int)(priceAfterDiscount*100)/100.0);
		return priceAfterDiscount;
	}
}
