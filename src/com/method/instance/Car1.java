package com.method.instance;

public class Car1 {
	public String carBrand, carModel;
	public double carPrice;
	
	public void addCarDetails(String brand, String model, double price) {
		carBrand = brand;
		carModel = model;
		carPrice = price;
	}
	
	public String displayDetails() {
		return "Car Brand : " + carBrand + "\nCar Model : " + 
				carModel + "\nCar Price : " + carPrice + " Lacs";
	}
	
	public static void main(String args[]) {
		Car1 car = new Car1();
		car.addCarDetails("Toyota", "Corolla", 9.74);
		System.out.println(car.displayDetails());
	}
}
