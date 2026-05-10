package com.method;

public class StudentPercentage {
	
	public static int marks1 = 78, marks2 = 85, marks3 = 90;
	
	public static int total() {
		return (marks1 + marks2 + marks3);
	}
	
	public static void percentage() {
		System.out.println("Percentage = " + total()/3 + "%");
	}

	public static void main(String[] args) {
		percentage();
	}

}
