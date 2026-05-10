package com.blcelc;

public class Car {
	    public int carId;
	    public String brand;
	    public String model;
	    public double rentalPricePerDay;

	    public void setCarId(int id) {
	        carId = id;
	    }

	    public void setBrand(String b) {
	        brand = b;
	    }

	    public void setModel(String m) {
	        model = m;
	    }

	    public void setRentalPricePerDay(double price) {
	        rentalPricePerDay = price;
	    }

	    public int getCarId() {
	        return carId;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public String getModel() {
	        return model;
	    }

	    public double getRentalPricePerDay() {
	        return rentalPricePerDay;
	    }
}
