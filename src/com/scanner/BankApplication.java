package com.scanner;

public class BankApplication {
	private String customerName;
	private String customerAddress;
	private long phoneNumber;
	private double balance;
	
	public BankApplication(String customerName, String customerAddress, long phoneNumber, double balancs) {
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.phoneNumber = phoneNumber;
		this.balance = balancs;
		System.out.println("Account Created Successfully");
	}
	
	public void deposit(double amount) {
		if( amount <= 0) {
			System.err.println("Enter valid amount!");
		} else {
			balance += amount;
			System.out.println("Deposit successful, available balance: " + balance);
		}
	}
	
	public void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid withdrawal amount");
		} else if(amount > balance) {
			System.out.println("Insufficient funds");
		} else {
			balance -= amount;
			System.out.println("Withdraw successful, remaining balance: " + balance);
		}
	}
	
	public void showBalance() {
		System.out.println("Available Balance: " + balance);
	}
}
