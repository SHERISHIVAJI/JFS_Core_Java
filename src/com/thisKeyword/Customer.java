package com.thisKeyword;

public class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	public Customer() {
		System.out.println("Parameterless constructor called");
	}
	
	public Customer(String customerName, long contactNumber, String address) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	public Customer(String customerId, String customerName, long contactNumber,
			String address) {
		// this() is used to invoke the constructor of the current class
		// Since no parameters are specified, parameterless constructor will be invoked
		this();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	public void displayCustomerName() {
		System.out.println("Customer Name : " + customerName);
	}
	
	public void displayCustomerDetails() {
        System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		this.displayCustomerName();
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
	}
}
