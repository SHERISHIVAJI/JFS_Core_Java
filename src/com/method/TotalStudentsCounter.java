package com.method;

public class TotalStudentsCounter {
	
	public static int studentcount = 0;
	
	public static void addStudents(int n) {
		studentcount += n;
	}

	public static void main(String[] args) {
		addStudents(20);
		addStudents(32);
		addStudents(45);
		System.out.println("Final count of students = " + studentcount);
	}

}
