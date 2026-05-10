package com.swiftfood;

public class Order {
	private int orderId;
	private String orderedFoods;
	private double totalPrice;
	private String status;
	
	public Order() {
		this.status = "Ordered";
	}
	
	public Order(int orderId, String orderedFoods) {
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(String orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double calculateTotalPrice(int unitPrice) {
		totalPrice = unitPrice * 1.05;
		return totalPrice;
	}
	
}
