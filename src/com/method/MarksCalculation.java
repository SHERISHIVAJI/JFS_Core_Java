package com.method;

public class MarksCalculation {
	
	public static int sub1 = 85, sub2 = 90, sub3 = 80;
	
	public static void totalMarks() {
		System.out.println("Total Marks = " + (sub1 + sub2 + sub3));
	}

	public static void averageMarks() {
		int avg = (sub1 + sub2 + sub3) / 2;
		System.out.println("Average Marks = " + avg);
	}
	
	public static void main(String[] args) {
		totalMarks();
		averageMarks();
	}

}
