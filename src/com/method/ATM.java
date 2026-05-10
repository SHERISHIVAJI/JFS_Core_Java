package com.method;

public class ATM {
	
	public static void accountBalance(String name, double balance) {
		System.out.println("Account Holder: " + name);
		System.out.println("Balance: " + balance);
	}
	
	public static void main(String[] args) {
		accountBalance("SHERI SHIVAJI", 1064.03);
	}

}
