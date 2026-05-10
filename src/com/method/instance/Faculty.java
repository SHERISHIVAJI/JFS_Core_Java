package com.method.instance;

public class Faculty {
	public static String universityName;
	public String facultyName, department;
	
	public void showFacultyDetails() {
		System.out.println("University Name : " + universityName);
		System.out.println("Faculty Name : " + facultyName);
		System.out.println("Department : " + department);
		System.out.println("------------------------------------");
	}
	
	public static void main(String[] args) {
		universityName = "Stanford University";
		Faculty f1 = new Faculty();
		f1.facultyName = "Dr. Robert Brown";
		f1.department = "Computer Science";
		f1.showFacultyDetails();
		
		Faculty f2 = new Faculty();
		f2.facultyName = "Dr. Lisa Green";
		f2.department = "Physics";
		f2.showFacultyDetails();
	}
}
