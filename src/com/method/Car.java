package com.method;

public class Car {
	
	String carMake;
	String carModel;
	int manufacturingYear;
	
	public void addCarDetails(String make, String model, int year) {
		carMake = make;
		carModel = model;
		manufacturingYear = year;
	}
	
	public String displayDetails() {
		return "Car Make : " + carMake + "\nCar Model : " + carModel + "\nManufacturing Year : " + manufacturingYear;
	}
	
	public static void main(String args[]) {
		Car car = new Car();
		car.addCarDetails("Toyota", "Corolla", 2021);
		System.out.println(car.displayDetails());
	}

}