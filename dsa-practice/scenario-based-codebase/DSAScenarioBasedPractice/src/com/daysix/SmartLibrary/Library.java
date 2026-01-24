package com.daysix.SmartLibrary;

import java.util.ArrayList;

public class Library {
	protected ArrayList<Book> borrowedBooks;

	public Library() {
		this.borrowedBooks = new ArrayList<Book>();
	}

	public void borrowBook(String title) {
		Book newBook = new Book(title);
		int i = borrowedBooks.size() - 1;

		while (i >= 0 && newBook.compareTo(borrowedBooks.get(i)) < 0) {
			i--;
		}

		borrowedBooks.add(i + 1, newBook);
	}

	public void display() {
		System.out.println("Books list: ");
		if (borrowedBooks.isEmpty()) {
			System.out.println("No books borrowed yet.");
		} else {
			for (Book book : borrowedBooks) {
				System.out.println(book);
			}
		}
	}
}
