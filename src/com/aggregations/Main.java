package com.aggregations;

class Address {
	String city, state, country;

	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Employee {
	int id;
	String name;
	Address address;

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}
}

public class Main {
	public static void main(String[] args) {
		Address address1 = new Address("Hyderabad", "Telangana", "India");
		Address address2 = new Address("Sangareddy", "Telangana", "India");
		
		Employee employee1 = new Employee(101, "Sheri Shivaji", address1);
		Employee employee2 = new Employee(102, "SHERI SHIVAJI", address2);
		
		employee1.display();
		employee2.display();
	}

}
