package com.blcelc;

public class PayrollSystem {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setEmployeeId(101);
		emp.setEmployeeName("SHERI SHIVAJI");
		emp.setSalary(600000);
		
		System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Salary: " + emp.getSalary());
        
        emp.setSalary(35000);

        System.out.println("Current Salary: " + emp.getSalary());
	}

}
