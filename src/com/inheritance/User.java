package com.inheritance;

public class User {
	private int userId;
	private String name;
	
	public User() {
		System.out.println("User Account Created Successfully");
	}
	
	public User(int userId, String name) {
//		this();
		this.userId = userId;
		this.name = name;
	}
	
	public void showUserDetails() {
		System.out.println("***************User Details**************");
		System.out.println("User Id : " + userId);
		System.out.println("User Name : " + name);
	}
}
