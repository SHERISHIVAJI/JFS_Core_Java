package com.inheritance;

public class DeliveryPartner extends User {
	private String vehicleType;
	
	public DeliveryPartner(int userId, String name, String vehicleType) {
		super(userId, name);
		this.vehicleType = vehicleType;
	}
	
	public void deliverOrder() {
		System.out.println("Order Delivered using " + vehicleType);
	}
}
