package com.method;

public class CarFare {

	public static void calculateFare(String name, float distance) {
		System.out.println("Name of the customer: " + name);
		System.out.println("Total distance travelled: " + distance);
		System.out.println("Total fare: " + distance * 12);
	}
	
	public static void main(String[] args) {
		calculateFare("SHERI SHIVAJI", 23.5f);
	}
}
