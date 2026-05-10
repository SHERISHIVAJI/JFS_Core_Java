package com.blcelc;

public class BankAccount {
	public long accountNumber;
	public String accountHolderName;
	public double balance;
	
	public void setAccountNumber(long an) {
		accountNumber = an;
	}
	
	public void setAccountHolderName(String ahn) {
		accountHolderName = ahn;
	}
	
	public void setBalance(double bal) {
		balance = bal;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
}
