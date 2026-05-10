package com.thisKeyword;

class Rectangle {
    //Implement your code here   
    public float length;
	public float width;
	
	public double calculateArea() {
	    double area = length * width;
		return Math.round(area*100.0)/100.0;
	}
	
	public double calculatePerimeter() {
	    double perimeter = 2 * ( length + width);
		return Math.round(perimeter*100.0)/100.0;
	}
}

class Tester {

	public static void main(String args[]) {
		
		Rectangle rectangle=new Rectangle();
		//Assign values to the member variables of Rectangle class
		rectangle.length = 12f;
		rectangle.width = 5f;

		//Invoke the methods of the Rectangle class to calculate the area and perimeter
		double area = rectangle.calculateArea();
		double perimeter = rectangle.calculatePerimeter();
		
		//Display the area and perimeter using the lines given below
		System.out.println("Area of the rectangle is " + area);
		System.out.println("Perimeter of the rectangle is " + perimeter);
	}

}