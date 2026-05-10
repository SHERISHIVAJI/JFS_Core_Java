package com.blcelc;

public class CarRentalService {
	public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();

        c1.setCarId(1);
        c1.setBrand("Toyota");
        c1.setModel("Corolla");
        c1.setRentalPricePerDay(2500);

        c2.setCarId(2);
        c2.setBrand("Ford");
        c2.setModel("Mustang");
        c2.setRentalPricePerDay(5000);

        System.out.println("---------------------Car 1 Details-----------------");
        System.out.println("Car ID: " + c1.getCarId());
        System.out.println("Car Brand: " + c1.getBrand());
        System.out.println("Car Model: " + c1.getModel());
        System.out.println("Car Price Per Day: " + c1.getRentalPricePerDay());

        System.out.println("---------------------Car 2 Details------------------");
        System.out.println("Car ID: " + c2.getCarId());
        System.out.println("Car Brand: " + c2.getBrand());
        System.out.println("Car Model: " + c2.getModel());
        System.out.println("Car Price Per Day: " + c2.getRentalPricePerDay());
    }
}
