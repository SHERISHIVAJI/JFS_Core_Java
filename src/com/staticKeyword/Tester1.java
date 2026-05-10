package com.staticKeyword;

class Customer2 {
	private static int counter; // Declaring the static variable counter
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;
	private static float deliveryCharge;
	static {
		deliveryCharge = 1.5f;
		counter = 100; // Initializing the static variable counter
	}
	public Customer2(String customerName, long contactNumber, String address) {
		// Incrementing the counter and initializing customerId
		this.customerId = "C" + ++Customer2.counter;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	// Static method to get the value of static variable counter
	public static int getCounter() {
		return counter;
	}
	// Static method to change the value of static variable counter if needed
	public static void setCounter(int counter) {
		Customer2.counter = counter;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static float getDeliveryCharge() {
		return deliveryCharge;
	}
	public static void setDeliveryCharge(float deliveryCharge) {
		Customer2.deliveryCharge = deliveryCharge;
	}
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details");
		System.out.println("Customer Id: " + this.customerId);
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Contact Number: " + this.contactNumber);
		System.out.println("Address: " + this.address);
		System.out.println("Delivery Charge: " + Customer2.deliveryCharge);
		System.out.println();
	}
	public double payBill(double totalPrice) {
		double discountPercentage = 5;
		System.out.println("Calculating final amount to be paid.....");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		double finalBillAmount = priceAfterDiscount + Customer2.deliveryCharge;
		return finalBillAmount;
	}
}
public class Tester1 {
	public static void main(String[] args) {
		Customer2 customer1 = new Customer2("Sam", 9945000009L, "Carolina Street, Springfield, 62702");
		Customer2 customer2 = new Customer2("John", 9645000009L, "Carolina Street, Springfield, 62708");
		Customer2 customer3 = new Customer2("Alex", 9745000009L, "Carolina Street, Springfield, 62768");
		System.out.println("Customer Id for the first customer is: " + customer1.getCustomerId());
		System.out.println("Customer Id for the second customer is: " + customer2.getCustomerId());
		System.out.println("Customer Id for the third customer is: " + customer3.getCustomerId());
	}
}
