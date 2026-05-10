package com.method;

public class EmployeeSalaryUpdate {

	public static int basic = 20000, bonus = 5000;
	
	public static void calculateSalary() {
		System.out.println("Total Salary = " + (basic + bonus));
	}
	
	public static void main(String[] args) {
		calculateSalary();
	}

}
