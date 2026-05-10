package com.scanner;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your address: ");
		String address = sc.nextLine();
		System.out.print("Enter your phone number: ");
		long phoneNumber = sc.nextLong();
		System.out.print("Enter your initial deposit balance: ");
		double balance = sc.nextDouble();
		
		BankApplication bank = new BankApplication(name, address, phoneNumber, balance);
		while(true) {
			System.out.println("\n***** Select an Option from Below *****");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Show Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your option [1-4]: ");
			int option = sc.nextInt();
			switch(option) {
			case 1: 
				System.out.print("Enter your withdrawal amount: ");
				double withdrawAmount = sc.nextDouble();
				bank.withdraw(withdrawAmount);
				break;
			
			case 2:
				System.out.print("Enter deposit money: ");
				double depositAmount = sc.nextDouble();
				bank.deposit(depositAmount);
				break;
				
			case 3:
				bank.showBalance();
				break;
				
			case 4:
				System.out.println("Thank You!");
				System.exit(0);
			default: 
				System.out.println("Invalid Option");
			}
		}
	}
}
