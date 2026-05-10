package com.method.instance;

public class Car {

	public static String showroomName;
	public String modelName;
	public int price;
	public void displayDetails() {
		System.out.println("Showroom Name : " + showroomName);
		System.out.println("Car Model : " + modelName);
		System.out.println("Car Price : " + price);
		System.out.println("---------------------------------");
	}
	
	public static void main(String[] args) {
		showroomName = "Elite Motors";
		Car car1 = new Car();
		car1.modelName = "Tesla Models";
		car1.price = 80000;
		car1.displayDetails();
		
		Car car2 = new Car();
		car2.modelName = "BMW X5";
		car2.price = 75000;
		car2.displayDetails();
	}

}
