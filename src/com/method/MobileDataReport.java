package com.method;

public class MobileDataReport {
	
	public static void mobileDataDetails(String userName, double usedData, double totalData) {
		System.out.println("User Name: " + userName);
		System.out.println("Data used by the user: " + usedData);
		System.out.println("Total Data plane: " + totalData);
		System.out.println("Remaining data available: " + (totalData - usedData));
	}

	public static void main(String[] args) {
		mobileDataDetails("SHERI SHIVAJI", 2.5, 6);
	}

}
