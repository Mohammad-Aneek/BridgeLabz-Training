package com.dayfour.SmartShelf;

public class Shelf {
	private Book[] books;
	private int count;

	public Shelf(int shelfSize) {
		if (shelfSize < 1) {
			shelfSize = 10;
		}

		this.books = new Book[shelfSize];
		this.count = 0;
	}

	public boolean addBook(Book book) {
		if (count == books.length) {
			return false;
		}

		int temp = count - 1;
		while (temp >= 0) {
			if (book.compareTo(books[temp]) < 0) {
				books[temp + 1] = books[temp];
				temp--;
			} else {
				break;
			}
		}
		books[temp + 1] = book;
		count++;
		return true;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == books.length;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("[ ");
		for (Book book : books) {
			if (book == null) {
				break;
			}
			str.append(book.toString() + ", ");
		}
		str.append(']');

		return str.toString();
	}
}
