package com.blcelc;

public class Library {
	public static void main(String[] args) {
		Book b1 = new Book();
        Book b2 = new Book();

        b1.setBookId(1);
        b1.setTitle("Java Programming");
        b1.setAuthor("James Gosling");
        b1.setPrice(500);

        b2.setBookId(2);
        b2.setTitle("Python Basics");
        b2.setAuthor("Guido van Rossum");
        b2.setPrice(450);

        System.out.println("-----------------Book 1 Details-------------");
        System.out.println("Book ID: " + b1.getBookId());
        System.out.println("Book Title: " + b1.getTitle());
        System.out.println("Book Author: " + b1.getAuthor());
        System.out.println("Book Price: " + b1.getPrice());

        System.out.println("-----------------Book 2 Details--------------");
        System.out.println("Book ID: " + b2.getBookId());
        System.out.println("Book Title: " + b2.getTitle());
        System.out.println("Book Author: " + b2.getAuthor());
        System.out.println("Book Price: " + b2.getPrice());
	}
}
