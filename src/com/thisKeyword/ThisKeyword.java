package com.thisKeyword;

public class ThisKeyword {
	int rollNo;
	String name;
	float fee;
	
	public ThisKeyword() {
		
	}
	
	public ThisKeyword(int rollNo, String name, float fee) {
//		rollNo = rollNo;
//		name = name;
//		fee = fee;
		this();
		this.rollNo = rollNo;
		this.name = name;
		this.fee = fee;
	}
	
	void test() {
		
	}
	
	void display() {
		System.out.println(rollNo + " " + name + " " + fee);
	}
	
	public static void main(String[] args) {
		ThisKeyword keyword = new ThisKeyword(101, "Shivaji", 3.4f);
		keyword.display();
	}
}
