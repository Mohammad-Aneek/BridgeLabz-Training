package com.dayone.BookShelf;

public class BookNode {
	Book book;
	BookNode next;

	BookNode(Book book) {
		this.book = book;
		this.next = null;
	}
}
