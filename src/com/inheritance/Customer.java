package com.inheritance;

public class Customer extends User {
	
	private String address;
	
	public Customer(int userId, String name, String address) {
		super(userId, name);
		this.address = address;
	}
	
	public void showCustomerDetails() {
		super.showUserDetails();
		System.out.println("Customer Address : " + address);
	}
}
