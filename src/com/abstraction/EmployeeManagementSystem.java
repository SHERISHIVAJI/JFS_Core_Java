package com.abstraction;

import java.util.Scanner;

abstract class Employee {
	private String empId;
	private String name;
	private double salary;
	
	public Employee(String empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public abstract void displayDetails();
	
	//Setters
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//Getters
	public String getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
}

interface Bonus {
	void calculateBonus();
}

class Developer extends Employee implements Bonus {
	private String programmingLanguage;
	
	public Developer(String empId, String name, double salary, String programmingLanguage) {
		super(empId, name, salary);
		this.programmingLanguage = programmingLanguage;
		System.out.println("Developer is created");
	}
	
	@Override
	public void displayDetails() {
		System.out.println("===== Details Of Developer =====");
		System.out.println("Id : " + getEmpId());
		System.out.println("Name : " + getName());
		System.out.println("Salary : " + getSalary());
		System.out.println("Programming Language " + getName() + " working on : " + programmingLanguage);
	}
	
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	
	@Override
	public void calculateBonus() {
		System.out.println("Bonus Amount : " + getSalary()*0.1);
	}
}

class Manager extends Employee implements Bonus{
	private int teamSize;
	
	public Manager(String empId, String name, double salary, int teamSize) {
		super(empId, name, salary);
		this.teamSize = teamSize;
		System.out.println("Manager is created");
	}
	
	@Override
	public void displayDetails() {
		System.out.println("===== Details Of Manager =====");
		System.out.println("Id : " + getEmpId());
		System.out.println("Name : " + getName());
		System.out.println("Salary : " + getSalary());
		System.out.println("Size of the Team managed by " + getName() + " is : " + teamSize);
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	public int getTeamSize() {
		return teamSize;
	}
	
	@Override
	public void calculateBonus() {
		System.out.println("Bonus Amount : " + getSalary()*0.2);
	}
}

class Intern extends Employee implements Bonus {
	
	public Intern(String empId, String name, double salary) {
		super(empId, name, salary);
		System.out.println("Intern is created");
	}
	
	@Override
	public void displayDetails() {
		System.out.println("===== Details Of Intern =====");
		System.out.println("Id : " + getEmpId());
		System.out.println("Name : " + getName());
		System.out.println("Salary : " + getSalary());
	}
	
	@Override
	public void calculateBonus() {
		System.out.println("Bonus Amount : " + getSalary()*0.05);
	}
}

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Develoer Id : ");
		String empId = sc.next();
		
		sc.nextLine();
		
		System.out.print("Enter Developer Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Developer Salry : ");
		double salary = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Enter Programming Language : ");
		String pLang = sc.nextLine();
		
		if(empId.isEmpty() || name.isEmpty() || salary <= 0.0 || pLang.isEmpty()) {
			System.out.println("Invalid Details...");
			System.out.println("Exiting System...");
			return;
		}
		
		Developer developer = new Developer(empId, name, salary, pLang);
		
		developer.displayDetails();
		developer.calculateBonus();
		System.out.println();
		
		System.out.print("Enter Manager Id : ");
		empId = sc.next();
		
		sc.nextLine();
		
		System.out.print("Enter Manager Name : ");
		name = sc.nextLine();
		
		System.out.print("Enter Manager Salry : ");
		salary = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Enter Team Size : ");
		int teamSize = sc.nextInt();
		
		if(empId.isEmpty() || name.isEmpty() || salary <= 0.0 || teamSize <= 0) {
			System.out.println("Invalid Details...");
			System.out.println("Exiting System...");
			return;
		}
		
		Manager manager = new Manager(empId, name, salary, teamSize);
		
		manager.displayDetails();
		manager.calculateBonus();
		System.out.println();
		
		System.out.print("Enter Intern Id : ");
		empId = sc.next();
		
		sc.nextLine();
		
		System.out.print("Enter Intern Name : ");
		name = sc.nextLine();
		
		System.out.print("Enter Intern Salry : ");
		salary = sc.nextDouble();
		
		if(empId.isEmpty() || name.isEmpty() || salary <= 0.0) {
			System.out.println("Invalid Details...");
			System.out.println("Exiting System...");
			return;
		}
		
		Intern intern = new Intern(empId, name, salary);
		
		intern.displayDetails();
		intern.calculateBonus();
		sc.close();
	}
}
