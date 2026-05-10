package com.conditionalStatements;

public class EligibilityToVote {
	public boolean canVote(int age) {
		if(age >= 18)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		EligibilityToVote obj = new EligibilityToVote();
		System.out.println("Can vote (Age 20)? " + obj.canVote(20));
	}
}
