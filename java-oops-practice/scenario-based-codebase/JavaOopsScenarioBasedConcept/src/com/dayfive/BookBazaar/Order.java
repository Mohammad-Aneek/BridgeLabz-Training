package com.dayfive.BookBazaar;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Book> cart = new ArrayList<>();

	public void addBook(Book book) {
		if (book.sellCopy()) {
			cart.add(book);
			System.out.println("Added: " + book);
		} else {
			System.out.println("Out of Stock: " + book);
		}
	}

	public void checkout() {
		double total = 0;
		for (Book b : cart) {
			total += b.applyDiscount();
		}

		System.out.printf("Order completed! Total Paid: %.2f\n", total);
	}
}
