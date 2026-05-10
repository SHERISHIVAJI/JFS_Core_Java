package com.staticKeyword;

class Customer1 {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;
	private static float deliveryCharge;
	static {
		deliveryCharge = 1.5f;
	}
	public Customer1(String customerId, String customerName, long contactNumber,
			String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
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
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
	public double payBill(double totalPrice) {
		double discountPercentage = 5;
		System.out.println("Calculating final amount to be paid.....");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
        double finalBillAmount=priceAfterDiscount + deliveryCharge;
		return finalBillAmount;
	}
}

public class StaticBlock {
	public static void main(String[] args) {
		Customer1 customer1 = new Customer1("C1001", "Sam", 9945000009L, "Carolina Street, Springfield, 62702");
		Customer.setDeliveryCharge(2f);
		System.out.println("Final amount to be paid: $" + customer1.payBill(20));
		Customer customer2 = new Customer("C1002", "John", 9645000009L, "Carolina Street, Springfield, 62708");
		System.out.println("Final amount to be paid: $" + customer2.payBill(15));
		System.out.println("Delivery Charge for the customers are: " + Customer.getDeliveryCharge());
	}
}
