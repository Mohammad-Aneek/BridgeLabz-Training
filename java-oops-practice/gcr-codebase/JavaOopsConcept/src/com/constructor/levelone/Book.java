package com.constructor.levelone;

class Book {
	private String title;
	private String author;
	private double price;
	
	Book(){
		this.title = null;
		this.author = null;
		this.price = 0;
	}
	
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void display() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Price: " + this.price);
	}
}
