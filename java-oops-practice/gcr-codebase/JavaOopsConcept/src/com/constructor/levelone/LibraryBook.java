package com.constructor.levelone;

class LibraryBook {
	private String title;
	private String author;
	private double price;
	private boolean availability;
	private String borrowedBy;
	
	// default constructor
	public LibraryBook() {
		this.title = null;
		this.author = null;
		this.price = 0;
		this.availability = false;
	}
	
	// parameterized constructor
	public LibraryBook(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = true;
	}
	
	// copy constructor
	public LibraryBook(LibraryBook object) {
		this.title = object.title;
		this.author = object.author;
		this.price = object.price;
		this.availability = true;
	}
	
	// borrow method
	public void borrowBook(String userID) {
		if (!availability) {
			System.out.println("Already borrowed! Can not borrow");
		} else {
			this.availability = false;
			this.borrowedBy = userID;
			System.out.println("");
		}
	}
	
	// return book method
	public void returnBook(String userID) {
		if (availability) {
			System.out.println("Return Failed! Book is already available");
		} else if (userID != this.borrowedBy) {
			System.out.println("Return Failed! Book borrowed by someone else");
		} else {
			this.availability = true;
			this.borrowedBy = null;
			System.out.println("Book returned succesfully");
		}
	}
	
	void display() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Price: " + this.price);
		if (!availability) {
			System.out.println("Borrowed by: " + this.borrowedBy);
		}
	}
}
