package com.inheritance;

public class Admin extends User {
	public Admin(int userId, String name) {
		super(userId, name);
	}
	
	public void addUser() {
		System.out.println("New User added successfully");
	}
}
