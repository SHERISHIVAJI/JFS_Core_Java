package com.packages;

import java.util.Scanner;

public class BankProcessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int accNum = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Account Holder Name: ");
		String accHol = sc.nextLine();
		System.out.println("Enter Balance: ");
		double balance = sc.nextDouble();
		
		BankAccount ba = new BankAccount(accNum, accHol, balance);
		System.out.println("Current Balance: " + ba.getBalance());
		
		System.out.println("Enter amount to diposit: ");
		double depositAmount = sc.nextDouble();
		ba.deposit(depositAmount);
		System.out.println("Balance after Deposit: " + ba.getBalance());
		
		System.out.println("Enter amount to withdraw: ");
		double withsrawAmount = sc.nextDouble();
		ba.withdraw(withsrawAmount);
		System.out.println("Balance Aftert Withdraw: " + ba.getBalance());
		sc.close();
	}

}
