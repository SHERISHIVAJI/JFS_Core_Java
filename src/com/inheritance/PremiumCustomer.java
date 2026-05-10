package com.inheritance;

public class PremiumCustomer extends Customer {
	private double discount;
	
	public PremiumCustomer(int userId, String name, String address, double discount) {
		super(userId, name, address);
		this.discount = discount;
	}
	
	public void calculateBill(double amount) {
		if(discount > 50) {
			System.out.println("Invalid discount");
			return;
		}
		
		if(amount <= 0) {
			System.out.println("Invalid amount");
			return;
		}
		double finalAmount = amount - (amount * discount / 100);
		System.out.println("Final Bill after discount: " + finalAmount);
	}
}
