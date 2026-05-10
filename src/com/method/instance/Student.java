package com.method.instance;

public class Student {
	public String studentName;
	public int studentId, studentMarks;

	public void addStudentDetails(String name, int id, int marks) {
		studentName = name;
		studentId = id;
		studentMarks = marks;
	}

	public String displayDetails() {
		return "Student Name : " + studentName + "\nStudent Id : " + studentId + "\nStudent Marks : " + studentMarks;
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		std.addStudentDetails("SHERI SHIVAJI", 101, 67);
		System.out.println(std.displayDetails());
	}
}
