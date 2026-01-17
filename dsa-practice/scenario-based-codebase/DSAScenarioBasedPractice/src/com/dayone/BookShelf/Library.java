package com.dayone.BookShelf;

import java.util.HashMap;
import java.util.HashSet;

public class Library {
	protected String name;
	HashMap<Genre, BookList> bookShelf;
	HashMap<Genre, HashSet<Book>> bookRecord;

	public Library(String name) {
		this.name = name;
		this.bookShelf = new HashMap<Genre, BookList>();
		this.bookRecord = new HashMap<Genre, HashSet<Book>>();
	}

	public boolean addBook(Book book) {
		if (book == null) {
			return false;
		}

		if (!bookShelf.containsKey(book.getGenre())) {
			bookShelf.put(book.getGenre(), new BookList());
			bookRecord.put(book.getGenre(), new HashSet<Book>());
		}

		Genre genre = book.getGenre();

		// checking for duplicates
		if (bookRecord.get(genre).contains(book)) {
			return false;
		}

		bookShelf.get(genre).addBook(book);
		bookRecord.get(genre).add(book);

		return true;
	}

	public boolean borrowBook(User user, Genre genre) {
		if (bookShelf.containsKey(genre)) {
			if (bookShelf.get(genre).borrow(user)) {
				return true;
			}
			return false;
		} else {
			return false;
		}
	}

	public boolean returnBook(User user, int pos) {
		Book book = user.getBook(pos);
		if (book == null) {
			return false;
		}
		Genre genre = book.getGenre();
		if (bookShelf.containsKey(genre)) {
			return bookShelf.get(genre).returnBook(user, book);
		} else {
			return false;
		}
	}
}
