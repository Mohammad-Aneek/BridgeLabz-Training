package com.objectmodeling.libraryandbooks;

class Book {
	public String ISBN;
	protected String title;
	private String author;
	private double price;

	Book(String ISBN, String title, String author, double price) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void display() {
		System.out.println("ISBN: " + this.ISBN);
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Price: " + this.price);
	}
}
