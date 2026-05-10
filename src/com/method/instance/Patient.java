package com.method.instance;

public class Patient {
	public static String hospitalName;
	public String patientName;
	public int age;
	
	public void printDetails() {
		System.out.println("Hospital Name : " + hospitalName);
		System.out.println("Patient Name : " + patientName);
		System.out.println("Patient Age : " + age);
		System.out.println("-----------------------------------");
	}
	
	public static void main(String[] args) {
		hospitalName = "City Care Hospital";
		Patient p1 = new Patient();
		p1.patientName = "John Doe";
		p1.age = 45;
		p1.printDetails();
		
		Patient p2 = new Patient();
		p2.patientName = "Emma Watson";
		p2.age = 30;
		p2.printDetails();
	}
}
