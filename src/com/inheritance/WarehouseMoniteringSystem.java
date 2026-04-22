package com.inheritance;

import java.util.Scanner;

class StockHandler {
	private String handlerName;
	private String handlerId;
	
	public StockHandler(String handlerName, String handlerId) {
		this.handlerName = handlerName;
		this.handlerId = handlerId;
		System.out.println("Stock Performance Profile Created");
	}
	
	public void showHandlerDetails() {
		System.out.println("Stock Performance Summary");
		System.out.println("Handler Name : " + handlerName);
		System.out.println("Handler Id : " + handlerId);
	}
}

class StockPerformance extends StockHandler {
	private int stockQuantities;
	private int totalStockHandled;
	private double averageStockPerEntry;
	private String handlingGrade;
	
	public StockPerformance(String handlerName, String handlerId) {
		super(handlerName, handlerId);
	}
	
	public void addStockEntry(int stockQuantity) {
		if(stockQuantity < 0) {
			System.out.println("Invalid Quantity Entered.");
			return;
		}
		totalStockHandled += stockQuantity;
		stockQuantities++;
	}
	
	public void recalculatePerformanceResult() {
		if(stockQuantities == 0) {
			System.out.println("No stock entries available");
            return;
		}
		averageStockPerEntry = (double) totalStockHandled / stockQuantities;
		
		if(averageStockPerEntry >= 45)
			handlingGrade = "Efficient";
		else if(averageStockPerEntry >= 30)
			handlingGrade = "Average";
		else
			handlingGrade = "Needs Improvement";
	}
	
	public void viewSummary() {
		showHandlerDetails();
		System.out.println("Total Stock Handled : " + totalStockHandled);
		System.out.println("Average Stock Per Entry : " + averageStockPerEntry);
		System.out.println("Handling Grade : " + handlingGrade);
	}
}

public class WarehouseMoniteringSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Handler Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Handler Id : ");
		String id = sc.next();
		
		StockPerformance  sp = new StockPerformance(name, id);
		
		int choice;
		
		do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Stock");
            System.out.println("2. Recalculate Result");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
            case 1:
            	System.out.print("Enter Stock Quantity: ");
            	int quantity = sc.nextInt();
                sp.addStockEntry(quantity);
                break;

            case 2:
                sp.recalculatePerformanceResult();
                break;

            case 3:
                sp.viewSummary();
                break;

            case 4:
                System.out.println("Exiting program");
                break;

            default:
            	System.out.println("Invalid choice");
            }
		} while(choice != 4);
		sc.close();
	}
}
