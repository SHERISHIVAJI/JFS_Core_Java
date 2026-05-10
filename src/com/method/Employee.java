package com.method;

public class Employee {
	
	String employeeName;
	int employeeId;
	double employeeSalary;
	
	public void addEmployeeDetails(String name, int id, double salry) {
		employeeName = name;
		employeeId = id;
		employeeSalary = salry;
	}
	
	public String displayDetails() {
		return "Employee Name = " + employeeName + "\nEmployee Id = " + employeeId + "\nEmployee Salary = " + employeeSalary;
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.addEmployeeDetails("SHERI SHIVAJI", 101, 650000.0);
		System.out.println(emp.displayDetails());

	}
}