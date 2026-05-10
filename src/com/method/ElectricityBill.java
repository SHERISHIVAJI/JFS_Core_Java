package com.method;

public class ElectricityBill {

	public static void generateBill(String name, int units) {
		System.out.println("Customer Name: " + name);
		System.out.println("Number of units: " + units);
		System.out.println("Total electricity bill: " + units * 6);
	}
	
	public static void main(String[] args) {
		generateBill("SHERI SHIVAJI", 200);
	}
}
