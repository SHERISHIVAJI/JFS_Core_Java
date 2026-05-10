package com.packages;

public class BankAccount {
	private int accNum;
	private String accHol;
	private double balance;
	
	public BankAccount(int accNum,String accHol, double balance) {
		this.accNum = accNum;
		this.accHol = accHol;
		this.balance = balance;
	}
	
	//Getters
	public int getAccNum() {
		return accNum;
	}
	
	public String getAccHol() {
		return accHol;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//Setters
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount <= 0) {
			System.out.println("Enter sufficient amount!");
		} else {
			this.balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(balance >= amount)
			this.balance -= amount;
		else
			System.out.println("Insufficient Balance!");
	}
}
