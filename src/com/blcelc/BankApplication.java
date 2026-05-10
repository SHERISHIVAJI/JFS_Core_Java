package com.blcelc;

public class BankApplication {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.setAccountNumber(123456789012L);
		ba.setAccountHolderName("SHERI SHIVAJI");
		ba.setBalance(10000.87);
		
		System.out.println("Account Number : " + ba.getAccountNumber());
		System.out.println("Account Holder Name : " + ba.getAccountHolderName());
		System.out.println("Balance : " + ba.getBalance());
		
		ba.setBalance(15956.48);
		
		System.out.println("Account Balance After Update: " + ba.getBalance());
	}

}
