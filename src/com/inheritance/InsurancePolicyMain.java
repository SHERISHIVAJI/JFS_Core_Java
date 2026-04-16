package com.inheritance;

import java.util.Scanner;

public class InsurancePolicyMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("Choose policy Creation Method : ");
			System.out.println("1. Customer Name only");
			System.out.println("2. Customer Name, Policy Type, Policy Amount");
			System.out.println("3. Full Policy Details");
			System.out.print("Enter your choice: ");
			choice = input.nextInt();
			input.nextLine();
			
			InsurancePolicy ip = null;
			
			switch(choice) {
			case 1: {
				System.out.print("Enter Customer Name : ");
				String name = input.nextLine();
				ip = new InsurancePolicy(name);
				break;
			}
			case 2: {
				System.out.print("Enter Customer Name : ");
				String name = input.nextLine();
				
				System.out.print("Enter Policy Type : ");
				String policyType = input.nextLine();
				
				System.out.print("Enter Policy Amount : ");
				double policyAmount = input.nextDouble();
				
				ip = new InsurancePolicy(name, policyType, policyAmount);
				break;
			}
			case 3: {
				System.out.print("Enter Customer Name : ");
				String name = input.nextLine();
				
				System.out.print("Enter Policy Type : ");
				String policyType = input.nextLine();
				
				System.out.print("Enter Policy Amount : ");
				double policyAmount = input.nextDouble();
				
				System.out.print("Enter Appoved Amount : ");
				double approvedAmount = input.nextDouble();
				input.nextLine();
				System.out.print("Enter Policy Status : ");
				String policyStatus = input.nextLine();
				
				ip = new InsurancePolicy(name, policyType, policyAmount, approvedAmount, policyStatus);
				break;
			}
			default: {
				System.out.println("Invalid Choice. Exiting program...");
				return;
			}
			}
			
			int menuChoice;
			do {
				System.out.println("********** INSURANCE POLICY MENU **********");
				System.out.println("1. Update Approved Amount");
				System.out.println("2. Change Policy Status");
				System.out.println("3. View Policy Summary");
				System.out.println("4. Exit");
				System.out.print("Enter your choice: ");
				menuChoice = input.nextInt();
				input.nextLine();
				
				switch(menuChoice) {
				case 1: {
					System.out.print("Enter new approved amount : ");
					double newApprovedAmount = input.nextDouble();
					input.nextLine();
					ip.updateApprovedAmount(newApprovedAmount);
					break;
				}
				case 2: {
					System.out.print("Enter new policy status : ");
					String newPolicyStatus = input.nextLine();
					ip.changePolicyStatus(newPolicyStatus);
					break;
				}
				case 3: {
					ip.viewPolicySummary();
					break;
				}
				case 4: {
					System.out.println("Thank You For Creating Account...");
					break;
				}
				default:
					System.out.println("Invalid choice! Please try again.");
				}
			}while(menuChoice != 4);
		} while(choice != 4);
		input.close();
	}
}