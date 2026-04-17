package com.inheritance;

import java.util.Scanner;

class Staff {
	protected String staffName;
	protected int staffId;
	protected String baseShift;
	
	public Staff(String staffName, int staffId, String baseShift) {
		this.staffName = staffName;
		this.staffId = staffId;
		this.baseShift = baseShift;
	}
	
	public void displayStaffDetails() {
		System.out.println("***** STAFF DETAILS *****");
		System.out.println("Staff Name : " + staffName);
		System.out.println("Staff Id : " + staffId);
		System.out.println("Base Shift : " + baseShift);
	}
}

class DepartmentStaff extends Staff {
	private String departmentName;
	private int responsibilityLevel;
	
	public DepartmentStaff(String staffName, int staffId, String baseShift, String departmentName, int responsibilityLevel) {
		super(staffName, staffId, baseShift);
		this.departmentName = departmentName;
		this.responsibilityLevel = responsibilityLevel;
	}
	
	public void updateResponsibilityLevel(int newLevel) {
		if(newLevel > 0) {
			responsibilityLevel = newLevel;
			System.out.println("Responsibility level updated successfully.");
		} else {
			System.out.println("Invalid input. Responsibility level must be greater than 0.");
		}
	}
	
	public void updateDepartmentName(String newDepartment) {
		if(newDepartment != null && !newDepartment.equals("")) {
			departmentName = newDepartment;
			System.out.println("Department name updated successfully.");
		} else {
			System.out.println("Invalid input. Department name cannot be empty.");
		}
	}
	
	public void viewStaffProfileDetails() {
		displayStaffDetails();
		System.out.println("Department Name : " + departmentName);
		System.out.println("Responsibility Level : " + responsibilityLevel);
	}
}

public class StaffTrackingApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Staff Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Staff Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Base Shift : ");
		String shift = sc.nextLine();
		
		System.out.print("Enter Department Name : ");
		String depName = sc.nextLine();
		
		System.out.println("Enter Pesponsibility Level : ");
		int level = sc.nextInt();
		sc.nextLine();
		
		if(name.trim().isEmpty() || id <= 0 || shift.trim().isEmpty() || depName.trim().isEmpty() || level <= 0) {
			System.out.println("Invalid or empty details entered. Staff profile was not created.");
			return;
		}
		
		DepartmentStaff depStaff = new DepartmentStaff(name, id, shift, name, level);
		System.out.println("Staff profile has been created successfully.");
		
		int choice;
		do {
			System.out.println("***** Menu *****");
            System.out.println("1. Update Responsibility Level");
            System.out.println("2. Update Department Name");
            System.out.println("3. View Staff Profile Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            case 1: {
            	System.out.print("Enter new Responsibility Level: ");
                int newLevel = sc.nextInt();
                sc.nextLine();
                depStaff.updateResponsibilityLevel(newLevel);
                break;
            }
            
            case 2: {
            	System.out.print("Enter new Department Name : ");
            	String newDepName = sc.nextLine();
            	depStaff.updateDepartmentName(newDepName);
            	break;
            }
            
            case 3: {
            	depStaff.viewStaffProfileDetails();
            	break;
            }
            
            case 4: {
            	System.out.println("Exiting System...");
            	break;
            }
            
            default: 
            	System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
		} while(choice != 4);
		
		sc.close();
	}
}
