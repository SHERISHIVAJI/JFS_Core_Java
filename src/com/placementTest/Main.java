package com.placementTest;

import java.util.Scanner;

abstract class Vehicle {
	private String name;
	private String vehicleNumber;
	private String vehicleType;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name, String vehicleNumber, String vehicleType) {
		this.name = name;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public abstract void displayProfile();
}

interface ServiceOperations {
	void updateServiceCategory(String newCategory);
	void updateServiceCenter(String newCenter);
}

class ServiceVehicle extends Vehicle implements ServiceOperations {
	private String centerName;
	private String category;
	
	public ServiceVehicle() {
		super();
	}
	
	public ServiceVehicle(String name, String vehicleNumber, String vehicleType, String centerName, String category) {
		super(name, vehicleNumber, vehicleType);
		this.centerName = centerName;
		this.category = category;
		System.out.println("\nVehicle Profile Created Successfully");
	}
	
	@Override
	public void displayProfile() {
		System.out.println("Vehicle Details");
		System.out.println("------------------------------------");
		System.out.println("Owner Name : " + getName());
		System.out.println("Vehicle Number : " + getVehicleNumber());
		System.out.println("Vehicle Type : " + getVehicleType());
		System.out.println("Service Center : " + centerName);
		System.out.println("Service Category : " + category);
	}

	@Override
	public void updateServiceCategory(String newCategory) {
		if(newCategory.isEmpty()) {
			System.out.println("Invalid Category");
			return;
		}
		this.category = newCategory;
		System.out.println("Updated Service Category : " + category);
	}

	@Override
	public void updateServiceCenter(String newCenter) {
		if(newCenter.isEmpty()) {
			System.out.println("Invalid Center Name");
			return;
		}
		this.centerName = newCenter;
		System.out.println("Updated Service Center : " + centerName);
	}	
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Owner Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Vehicle Number: ");
		String vehicleNumber = sc.nextLine();
		
		System.out.print("Enter Vehicle Type: ");
		String type = sc.nextLine();
		
		System.out.print("Enter Service Center Name: ");
		String center = sc.nextLine();
		
		System.out.print("Enter Service Category: ");
		String category = sc.nextLine();
		
		if(name.isEmpty() || vehicleNumber.isEmpty() || type.isEmpty() || center.isEmpty() || category.isEmpty()) {
			System.out.println("Entered Invalid or Empty data...");
			return;
		}
		
		Vehicle vehicle = new ServiceVehicle(name, vehicleNumber, type, center, category);
		ServiceOperations operations = (ServiceVehicle)vehicle;
		
		boolean stop = true;
		do {
			System.out.println("\n--- Vehicle Service Menu ---");
			System.out.println("1. Update Service Category");
			System.out.println("2. Update Service Center");
			System.out.println("3. View Profile");
			System.out.println("4. Exit");
			
			System.out.print("\nEnter choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: {
				System.out.print("Enter new Service Category : ");
				String newCategory = sc.nextLine();
				operations.updateServiceCategory(newCategory);
				break;
			}
			case 2: {
				System.out.print("Enter new Service Center : ");
				String newCenter = sc.nextLine();
				operations.updateServiceCenter(newCenter);
				break;
			}
			case 3: {
				vehicle.displayProfile();
				break;
			}
			case 4: {
				System.out.println("Exiting System...");
				stop = false;
				break;
			}
			default: {
				System.out.println("Invalid Choice!");
			}
			}
		}while(stop);
		sc.close();
	}
}
