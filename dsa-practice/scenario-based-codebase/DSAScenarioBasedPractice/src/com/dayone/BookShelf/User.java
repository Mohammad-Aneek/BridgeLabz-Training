package com.dayone.BookShelf;

import java.util.ArrayList;

public class User {
	protected int id;
	protected String name;
	protected ArrayList<Book> borrowedBooks;

	User(int id, String name) {
		this.id = id;
		this.name = name;
		this.borrowedBooks = new ArrayList<Book>();
	}

	public boolean borrowBook(Book book) {
		if (borrowedBooks.size() >= 5) {
			return false;
		} else {
			borrowedBooks.add(book);
			return true;
		}
	}

	public boolean returnBook(Book book) {
		if (borrowedBooks.contains(book)) {
			borrowedBooks.remove(book);
			return true;
		} else {
			return false;
		}
	}

	public Book getBook(int pos) {
		if (pos > 0 && pos <= borrowedBooks.size()) {
			return borrowedBooks.get(pos - 1);
		} else {
			return null;
		}
	}
}
