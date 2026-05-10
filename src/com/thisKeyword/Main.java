package com.thisKeyword;

public class Main {

	public static void main(String[] args) {
//		Customer customer1 = new Customer("Jacob", 5648394590L, "13th Street, New York");
//		customer1.displayCustomerDetails();
		
		Order order = new Order();
		System.out.println(order.status);
		order.orderId = 101;
        order.orderedFoods = "Pizza";
        order.status = "Ordered";
        
        
        System.out.println("Order Details");
        System.out.println("Order Id: " + order.orderId);
        System.out.println("Ordered Food: " + order.orderedFoods);
        System.out.println("Status: " + order.status);
        System.out.println("Total Price: " + order.calculateTotalPrice(200));
        
        Restaurant restaurant = new Restaurant("McDonald's", 234567890, "SHA14y, ifb, efg", 4.1f);
        restaurant.displayRestaurantDetails();
	}

}
