package com.abstraction;

interface Person {
	void speekLanguage();
	void employmentStatus();
}

class Student implements Person {
	@Override
	public void speekLanguage() {
		System.out.println("I can speek Telugu, Kannada, English, Hindi");
	}

	@Override
	public void employmentStatus() {
		System.out.println("Un-employeed");
	}
}

class Lecturer implements Person {

	@Override
	public void speekLanguage() {
		System.out.println("I can speek English");
	}

	@Override
	public void employmentStatus() {
		System.out.println("I am employeed");
	}
}

public class PersonMain {
	public static void main(String[] args) {
		Person person1 = new Student();
		person1.speekLanguage();
		person1.employmentStatus();
		
		Person person2 = new Lecturer();
		person2.speekLanguage();
		person2.employmentStatus();
	}
}
