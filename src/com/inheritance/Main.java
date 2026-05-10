package com.inheritance;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Id : ");
		int userId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Address : ");
		String address = sc.nextLine();
		
		System.out.print("Enter discount : ");
		double discount = sc.nextDouble();
		
		Customer customer = new Customer(userId, name, address);
		PremiumCustomer premiumCustomer = new PremiumCustomer(userId, name, address, discount);
		DeliveryPartner deliveryPartner = new DeliveryPartner(101, "Delivery Boy", "Bike");
		Admin admin = new Admin(201, "Admin");
		
		int option;
		do {
			System.out.println("******MENU******");
			System.out.println("1. Show Customer Details");
			System.out.println("2. Calculate Bill");
			System.out.println("3. Deliver Order");
			System.out.println("4. Admin add User");
			System.out.println("5. Exit");
			System.out.print("Enter option: ");
			option = sc.nextInt();
			
			switch(option) {
				case 1: 
					customer.showCustomerDetails();
					break;
				case 2: 
					System.out.println("Enter Bill amount: ");
					double amount = sc.nextDouble();
					premiumCustomer.calculateBill(amount);
					break;
				case 3:
					deliveryPartner.deliverOrder();
					break;
				case 4:
					admin.addUser();
					break;
				case 5:
					System.out.println("Thank You!");
					System.exit(0);
				default:
					System.out.println("Invalid option");
			}
		} while(option != 5);
		sc.close();
	}
}
