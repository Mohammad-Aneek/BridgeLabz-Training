package com.daytwo.BookShelf;

public class BookNode {
	Book book;
	BookNode next;

	BookNode(Book book) {
		this.book = book;
		this.next = null;
	}
}
