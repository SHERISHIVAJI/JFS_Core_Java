package com.blcelc;

public class Book {
	public int bookId;
    public String title;
    public String author;
    public double price;

    public void setBookId(int id) {
        bookId = id;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setPrice(double p) {
        price = p;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
