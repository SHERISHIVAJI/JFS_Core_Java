package com.method;

public class CourseTraining {

	public static void trainingHourse(String trainerName, double hours, int numberOfDays) {
		System.out.println("Trainer Name: " + trainerName + " sir");
		System.out.println("Hourse per day: " + hours);
		System.out.println("total number of days: " + numberOfDays);
		System.out.println("Total training hourse: " + hours * numberOfDays);
	}
	
	public static void main(String[] args) {
		trainingHourse("Ravi Teja", 3, 210);
	}

}
