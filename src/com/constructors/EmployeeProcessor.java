package com.constructors;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "SHERI SHIVAJI", "Assossiate Developer", 600000.00, 4);
		System.out.println("***** BEFORE PROMOTION*****");
		System.out.println("Employee Id: " + emp.getEmpId());
		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee Designation: " + emp.getDesignation());
		System.out.println("Employee Salary: " + emp.getSalary());
		System.out.println("Employee Performance Rating: " + emp.getPerformanceRating());
		
		emp.promoteEmployee();
		
		System.out.println("\n***** AFTER PROMOTION*****");
		System.out.println("Employee Designation: " + emp.getDesignation());
		System.out.println("Employee Salary: " + emp.getSalary());
	}

}
