package com.dayfour.SmartShelf;

public class Book implements Comparable<Book> {
	private String name;

	public Book(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int compareTo(Book o) {
		return this.name.compareTo(o.name);
	}
}
