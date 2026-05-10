package com.constructors;

public class ConstructorChaining {
	public ConstructorChaining() {
		this("Shivaji");
		System.out.println("No Parameterized Constructor!");
	}
	
	public ConstructorChaining(String  name) {
		this(21, "CSE");
		System.out.println("One Parameterized Constructor!!");
		System.out.println("Name of the Student: " + name);
		System.out.println();
	}
	
	public ConstructorChaining(int age, String course) {
		System.out.println("Two Parameteized Constructor!!!");
		System.out.println("Age of the Student: " + age);
		System.out.println("Course of the Student: " + course);
		System.out.println();
	}
	
	public static void main(String[] args) {
		ConstructorChaining cc = new ConstructorChaining();
	}
}
