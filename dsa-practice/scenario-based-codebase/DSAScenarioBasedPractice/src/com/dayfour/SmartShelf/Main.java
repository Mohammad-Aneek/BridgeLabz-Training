package com.dayfour.SmartShelf;

public class Main {
	public static void main(String[] args) {
		Shelf myShelf = new Shelf(5);
		System.out.println(myShelf);

		myShelf.addBook(new Book("Java Programming"));
		System.out.println(myShelf);

		myShelf.addBook(new Book("Algorithms"));
		System.out.println(myShelf);

		myShelf.addBook(new Book("Python Basics"));
		System.out.println(myShelf);

		myShelf.addBook(new Book("C++ Guide"));
		System.out.println(myShelf);

		myShelf.addBook(new Book("Rust Book"));
		System.out.println(myShelf);
		
		myShelf.addBook(new Book("Overflow Book"));
		System.out.println(myShelf);
	}
}
