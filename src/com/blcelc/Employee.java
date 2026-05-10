package com.blcelc;

public class Employee {
	public int employeeId;
	public String employeeName;
	public double salary;
	
	public void setEmployeeId(int id) {
		employeeId = id;
	}
	
	public void setEmployeeName(String name) {
		employeeName = name;
	}
	
	public void setSalary(double sal) {
		salary = sal;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public double getSalary() {
		return salary;
	}
}
