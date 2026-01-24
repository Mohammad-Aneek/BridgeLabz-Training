package com.daysix.SmartLibrary;

public class Book implements Comparable<Book> {
	String title;

	public Book(String title) {
		this.title = title;
	}

	@Override
	public int compareTo(Book other) {
		return this.title.compareTo(other.title);
	}

	@Override
	public String toString() {
		return title;
	}
}
