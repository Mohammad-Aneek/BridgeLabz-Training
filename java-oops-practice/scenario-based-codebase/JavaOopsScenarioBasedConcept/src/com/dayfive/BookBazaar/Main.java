package com.dayfive.BookBazaar;

public class Main {
	public static void main(String[] args) {
		Book book = new PrintedBook("The Alchemist", "Paulo Coelho", 300, 2);
		Book ebook = new EBook("Some ebook", "Some author", 30.0);

		Order myOrder = new Order();

		myOrder.addBook(book);
		myOrder.addBook(book);
		myOrder.addBook(book);
		myOrder.addBook(ebook);

		myOrder.checkout();
	}
}
