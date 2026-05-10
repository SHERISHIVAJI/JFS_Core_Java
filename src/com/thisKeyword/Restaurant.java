package com.thisKeyword;

public class Restaurant {
	public String restaurantName;
	public long restaurantContact;
	public String restaurantAddress;
	public float rating;
	public Restaurant(String restaurantName, long restaurantContact, String restaurantAddress, float rating) {
		this.restaurantName = restaurantName;
		this.restaurantContact = restaurantContact;
		this.restaurantAddress = restaurantAddress;
		this.rating = rating;
	}

	public void displayRestaurantDetails() {
		System.out.println("Restaurant Details");
		System.out.println("Restaurant Name: " + restaurantName);
		System.out.println("Restaurant Contact: " + restaurantContact);
		System.out.println("Restaurant Address: " + restaurantAddress);
		System.out.println("Restaurant Rating: " + rating);
	}
}
