package com.constructors;

public class Employee {
	private int empId;
	private String name;
	private String designation;
	private double salary;
	private int performanceRating;
	
	public Employee(int empId, String name, String designation, double salary, int performanceRating) {
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.performanceRating = performanceRating;
	}
	
	//Getters
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getPerformanceRating() {
		return performanceRating;
	}
	
	//Setters
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void promoteEmployee() {
		if(performanceRating >= 4) {
			salary = salary + salary*0.2;
			setDesignation("Senior Developer");
		}
	}
}
