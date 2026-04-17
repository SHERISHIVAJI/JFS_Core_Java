package com.inheritance;

import java.util.Scanner;

class InsurancePolicy {
	private String name;
	private String policyType;
	private double policyAmount;
	private double approvedAmount;
	private String policyStatus;
	
	public InsurancePolicy(String name) {
		this.name = name;
		this.policyType = "Not Assigned";
		this.policyAmount = 0.0;
		this.approvedAmount = 0.0;
		this.policyStatus = "Pending";
		System.out.println("Policy record created successfully!");
	}
	
	public InsurancePolicy(String name, String policyType, double policyAmount) {
		this.name = name;
		this.policyType = policyType;
		if(policyAmount > 0)
			this.policyAmount = policyAmount;
		else {
			this.policyAmount = 0.0;
			System.out.println("Invalid policy amount. Default value 0.0 assigned.");
		}
		this.approvedAmount = 0.0;
		this.policyStatus = "Pending";
		System.out.println("Policy record created successfully!");
	}
	
	public InsurancePolicy(String name, String policyType, double policyAmount, double approvedAmount, String policyStatus) {
		this.name = name;
		this.policyType = policyType;
		if(policyAmount > 0)
			this.policyAmount = policyAmount;
		else {
			this.policyAmount = 0.0;
			System.out.println("Invalid policy amount. Default value 0.0 assigned.");
		}
		if(approvedAmount >= 0 && approvedAmount <= this.policyAmount)
			this.approvedAmount = approvedAmount;
		else {
			this.approvedAmount = 0.0;
			System.out.println("Invalid approved amount. Default value 0.0 assigned.");
		}
		this.policyStatus = policyStatus;
		System.out.println("Policy record created successfully!");
	}
	
	public void updateApprovedAmount(double approvedAmount) {
		if(approvedAmount >= 0 && approvedAmount <= policyAmount) {
			this.approvedAmount = approvedAmount;
			System.out.println("Approved amount updated successfully.");
		}
		else {
			System.out.println("Invalid approved amount! It must be between 0 and policy amount.");
		}
	}
	
	public void changePolicyStatus(String policyStatus) {
		if(policyStatus != null && !policyStatus.equals("")) {
			this.policyStatus = policyStatus;
			System.out.println("Policy Status updated successfully!");
		}
		else {
			System.out.println("Invalid policy status! Status cannot be empty.");
		}
	}
	
	public void viewPolicySummary() {
		System.out.println("********* POLICY SUMMARY **********");
		System.out.println("Customer Name : " + name);
		System.out.println("Policy Type : " + policyType);
		System.out.println("Policy Amount : " + policyAmount);
		System.out.println("Approved Amount : " + approvedAmount);
		System.out.println("Policy Status : " + policyStatus);
	}
}

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
		} while(true);
//		input.close();
	}
}