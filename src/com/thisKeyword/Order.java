package com.thisKeyword;

public class Order {
	public int orderId;
	public String orderedFoods;
	public double totalPrice;
	public String status;
	
	public Order() {
		this.status = "Ordered";
	}
	
	public Order(int orderId, String orderedFoods) {
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
	}

	public double calculateTotalPrice(int unitPrice) {
		this.totalPrice = unitPrice + unitPrice * 0.05;
		return totalPrice;
	}
}
