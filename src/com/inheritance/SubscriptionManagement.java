package com.inheritance;

import java.util.Scanner;

class SubscriptionPlan {
	private String subscriberName;
	private String planType;
	private double planCost;
	private double paidAmount;
	private String subscriptionStatus;
	
	public SubscriptionPlan() {
		this.subscriberName = "Not Provided";
		this.planType = "Not Selected";
		this.planCost = 0.0;
		this.paidAmount = 0.0;
		this.subscriptionStatus= "Inactive";
	}
	
	public SubscriptionPlan(String subscriptionName, String planType, double planCost) {
		this.subscriberName = subscriptionName;
		this.planType = planType;
		this.planCost = planCost;
		this.paidAmount = 0.0;
		this.subscriptionStatus= "Pending";
	}
	
	public SubscriptionPlan(String subscriberName, String planType, double planCost, double paidAmount, String subscriptionStatus) {
		this.subscriberName = subscriberName;
		this.planType = planType;
		this.planCost = planCost;
		this.paidAmount = paidAmount;
		this.subscriptionStatus= subscriptionStatus;
		System.out.println("Subscription record created successfully.");
	}
	
	public void updatePaidAmount(double newAmount) {
		if(newAmount < 0 || newAmount > planCost) {
			System.out.println("Invalid input. Paid amount must be between 0 and plan cost.");
		} else {
			paidAmount = newAmount;
			System.out.println("Paid amount updated successfully.");
		}
	}
	
	public void changeSubscriptionStatus(String newStatus) {
		if(newStatus == null || newStatus.trim().isEmpty()) {
			System.out.println("Invalid input. Subscription status cannot be empty.");
		} else {
			subscriptionStatus = newStatus;
			System.out.println("Subscription status updated successfully.");
		}
	}
	
	public void viewSubscriptionSummary() {
        System.out.println("----- Subscription Summary -----");
        System.out.println("Subscriber Name : " + subscriberName);
        System.out.println("Plan Type : " + planType);
        System.out.println("Plan Cost : " + planCost);
        System.out.println("Paid Amount : " + paidAmount);
        System.out.println("Subscription Status : " + subscriptionStatus);
    }
}

public class SubscriptionManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("Choose Subscription Creation Method : ");
			System.out.println("1. Without Any Details");
			System.out.println("2. Subscriber Name, Plan Type, Plan Cost");
			System.out.println("3. Fill Details");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			SubscriptionPlan subPlan = null;
			
			switch(choice) {
			case 1: {
				subPlan = new SubscriptionPlan();
				System.out.println("Subscription Plan Without Details has been created!");
				break;
			}
			
			case 2: {
				System.out.print("Enter Subscriber Name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter Plan Type: ");
		        String type = sc.nextLine();

		        System.out.print("Enter Plan Cost: ");
		        double cost = sc.nextDouble();
		        
		        if(name.trim().isEmpty() || type.trim().isEmpty() || cost < 0.0) {
		        	System.out.println("Invalid input. Subscription record was not created.");
		            return;
		        }
		        
		        subPlan = new SubscriptionPlan(name, type, cost);
		        System.out.println("Subscription Plan With basic Details created!");
		        break;
			}
			
			case 3: {
				System.out.print("Enter Subscriber Name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter Plan Type: ");
		        String type = sc.nextLine();

		        System.out.print("Enter Plan Cost: ");
		        double cost = sc.nextDouble();

		        System.out.print("Enter Paid Amount: ");
		        double paid = sc.nextDouble();
		        sc.nextLine();

		        System.out.print("Enter Subscription Status: ");
		        String status = sc.nextLine();

		        if (name.trim().isEmpty() || type.trim().isEmpty() || status.trim().isEmpty() || cost <= 0 || paid < 0 || paid > cost) {
		            System.out.println("Invalid input. Subscription record was not created.");
		            return;
		        }

		        subPlan = new SubscriptionPlan(name, type, cost, paid, status);
		        break;
			}
			
			default: {
				System.out.println("Invalid Choice. Exiting program...");
				return;
			}
			}
			
			int menuChoice;
			do {
				System.out.println("\n===== Menu =====");
	            System.out.println("1. Update Paid Amount");
	            System.out.println("2. Change Subscription Status");
	            System.out.println("3. View Subscription Summary");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            menuChoice = sc.nextInt();
	            sc.nextLine();
	            
	            switch(menuChoice) {
	            case 1: {
	            	System.out.print("Enter new Paid Amount: ");
                    double newPaid = sc.nextDouble();
                    sc.nextLine();
                    subPlan.updatePaidAmount(newPaid);
                    break;
	            }
	            case 2: {
	            	System.out.print("Enter new Subscription Status: ");
                    String newStatus = sc.nextLine();
                    subPlan.changeSubscriptionStatus(newStatus);
                    break;
	            }
	            case 3: {
	            	subPlan.viewSubscriptionSummary();
	            	break;
	            }
	            case 4: {
	            	System.out.println("Exiting System...");
	            	break;
	            }
	            default: {
	            	System.out.println("Invalid option. Please Enter Valid Option!");
	            }
	            }
			} while(menuChoice != 4);
		} while(true);
//		sc.close();
	}
}