package com.daytwo.BookShelf;

public class BookList {
	private BookNode head;
	private BookNode tail;
	private int size;

	public BookList() {
		this.head = this.tail = null;
	}

	// to add Book at end of BookShelf
	public void addBook(Book book) {
		if (head == null) {
			// if list is empty
			head = tail = new BookNode(book);
			size++;
		} else {
			// if list is not empty
			BookNode newNode = new BookNode(book);
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	public boolean borrow(User user) {
		if (head == null) {
			return false;
		}

		BookNode temp = head;
		while (temp != null) {
			Book book = temp.book;
			if (book.borrow(user)) {
				return true;
			}
			temp = temp.next;
		}

		return false;
	}

	public boolean returnBook(User user, Book book) {
		if (head == null) {
			return false;
		}

		BookNode temp = head;
		while (temp != null) {
			if (book == temp.book) {
				return book.returnBook(user);
			}
			temp = temp.next;

		}

		return false;
	}
}
