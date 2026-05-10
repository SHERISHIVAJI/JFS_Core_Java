package com.method;

public class PercentageCalculator {

	public static void percentage(String name, int sub1, int sub2, int sub3) {
		System.out.println("Name of the student: " + name);
		System.out.println("Subject1 marks: " + sub1);
		System.out.println("Subject2 marks: " + sub2);
		System.out.println("Subject3 marks: " + sub3);
		System.out.println("Total marks obtained: " + (sub1 + sub2 + sub3));
		System.out.println("Percentage: " + (sub1 + sub2 + sub3) / 3 + "%");
	}
	
	public static void main(String[] args) {
		percentage("SHERI SHIVAJI", 99, 94, 95);
	}

}
