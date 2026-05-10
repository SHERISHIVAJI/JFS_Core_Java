package com.method;

public class EmployeeSalarySlip {
	
	public static void salaryDetails(String empName, double basicSalary) {
		System.out.println("Employee Name: " + empName);
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("House Rent Allowance(HRA ~ 20%): " + 0.20 * basicSalary);
		System.out.println("Dearness Allowance(DA ~ 80%): " + 0.80 * basicSalary);
		System.out.println("Travel Allowance(TA ~ 10%): " + 0.10 * basicSalary);
		System.out.println("PF Deduction(12%): " + 0.12 * basicSalary);
		System.out.println("Gross Salary: " + (basicSalary + 0.20*basicSalary + 0.80*basicSalary + 0.10*basicSalary));
		System.out.println("Net Salary: " + ((basicSalary + 0.20*basicSalary + 0.80*basicSalary + 0.10*basicSalary) - 0.12*basicSalary));
	}

	public static void main(String[] args) {
		salaryDetails("SHERI SHIVAJI", 630000.00);
	}

}
