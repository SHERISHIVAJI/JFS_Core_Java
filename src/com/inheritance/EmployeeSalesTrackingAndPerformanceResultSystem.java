package com.inheritance;

import java.util.Scanner;

class SalesEmployee {
	private String empName;
	private int empId;
	
	public SalesEmployee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}
	
	public void viewDetails() {
		System.out.println("Employee: " + empName);
        System.out.println("Employee ID: " + empId);
	}
}

class PerformanceEmployee extends SalesEmployee{
	private int salesEntity;
	private int totalSales;
	private int averageSales;
	private String performanceGrade;
	
	public PerformanceEmployee(String empName, int empId) {
		super(empName, empId);
		salesEntity = 0;
		totalSales = 0;
		averageSales = 0;
		performanceGrade = "Not Calculated";
		System.out.println("Performance Profile Created!");
	}
	
	public void addSalesEntity(int amount) {
		if(amount > 0) {
			salesEntity++;
			totalSales += amount;
			System.out.println("Sales Entity added Successfully!");
		} else {
			System.out.println("Invalid sales amount. Please enter a positive value.");
		}
	}
	
	public void recalculatePerformance() {
		if(salesEntity == 0) {
			performanceGrade = "No Sales Data";
			System.out.println("No sales entity available");
			return;
		}
		
		averageSales = totalSales / salesEntity;
		
		if(averageSales >= 20000)
			performanceGrade = "Excelent";
		else if(averageSales >= 10000)
			performanceGrade = "Good";
		else if(averageSales >= 5000)
			performanceGrade = "Average";
		else 
			performanceGrade = "Poor";
		
		System.out.println("Performance result recalculated.");
		
	}
	
	public void viewSummary() {
        System.out.println("\nPerformance Summary");
        viewDetails();
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Average Sales: " + averageSales);
        System.out.println("Performance Grade: " + performanceGrade);
    }
}

public class EmployeeSalesTrackingAndPerformanceResultSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Name : ");
		String empName = sc.nextLine();
		
		System.out.print("Enter Employee Id : ");
		int empId = sc.nextInt();
		
		PerformanceEmployee pe = new PerformanceEmployee(empName, empId);
		
		int choice;
		do {
			System.out.println("***** MENU *****");
			System.out.println("1. Add Sales");
			System.out.println("2. Recalculate Result");
			System.out.println("3. View Summary");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: {
				System.out.println("Enter sales amount : ");
				int amount = sc.nextInt();
//				sc.nextLine();
				pe.addSalesEntity(amount);
				break;
			}
			
			case 2: {
				pe.recalculatePerformance();
				break;
			}
			
			case 3: {
				pe.viewSummary();
				break;
			}
			
			case 4: {
				System.out.println("Exiting System...");
				break;
			}
			
			default:
				System.out.println("Invalid Choice. Try Again!!!");
			}
		} while(choice != 4);
		sc.close();
	}
}
