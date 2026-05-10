package com.method;

public class MovieTicket {

	public static void ticketPrice(String movieName, int numberOfTickets, int price) {
		System.out.println("Movie Name: " + movieName);
		System.out.println("Number of Tickets: " + numberOfTickets);
		System.out.println("Price of each ticket: " + price);
		System.out.println("Total cost: " + numberOfTickets * price);
	}
	
	public static void main(String[] args) {
		ticketPrice("Couple Friendly", 2, 150);
	}
	
}
