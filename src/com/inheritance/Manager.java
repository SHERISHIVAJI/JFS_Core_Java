package com.inheritance;

public class Manager extends User{
	public Manager(int userId, String name) {
		super(userId, name);
	}
	
	public void moniterSystem() {
		System.out.println("System is being Monitering by Manager");
	}
}
