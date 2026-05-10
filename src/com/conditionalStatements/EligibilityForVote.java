package com.conditionalStatements;

public class EligibilityForVote {
	public static void main(String[] args) {
		int age = 20;
		if(age >= 18)
			System.out.println("Your age is: " + age + "\nYou are eligible to vote!");
		else
			System.out.println("Your age is: " + age + "\nYou are not eligible to vote!");
	}
}
