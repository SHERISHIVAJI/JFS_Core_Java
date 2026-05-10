package com.swiftfood;

public class Tester {
	public void test() {
		System.out.println("Hello");
	}
	
	public void test1() {
		this.test();
	}
	
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.customerId = "5D0";
		customer1.customerName = "Sheri SHivaji";
		customer1.contactNumber = 9849483963L;
		customer1.address = "Chapta-[k], kangti, Sangareddy, Telangana";
		
		Customer customer2 = new Customer();
		customer2.customerId = "5D1";
		customer2.customerName = "Jane";
		customer2.contactNumber = 7870098687L;
		customer2.address = "Morningside Road, Edinburgh, Scotland";
		
		customer1.displayCustomerDetails();
		
		customer1.payBill(500, 10);
		
		Order order1 = new Order();
		System.out.println("Status of order : " + order1.getStatus());
		
		Order order2 = new Order(1001, "Photo Frame");
		System.out.println("Status of order : " + order2.getStatus());
		System.out.println("Order Id : " + order2.getOrderId());
		System.out.println("Items ordered : " + order2.getOrderedFoods());
		
		
	}
}