package com.daytwo.BookShelf;

import java.util.Objects;

public class Book {
	protected int id;
	protected String title;
	protected String author;
	protected int pages;
	protected Genre genre;
	protected boolean borrowed;

	public Book(String title, String author, Genre genre, int pages) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pages = pages;
		this.borrowed = false;

	}

	public int getId() {
		return this.id;
	}

	public Genre getGenre() {
		return this.genre;
	}

	public String getTitle() {
		return title;
	}

	public boolean borrow(User user) {
		if (borrowed) {
			return false;
		} else if (user.borrowBook(this)) {
			borrowed = true;
			return true;
		} else {
			return false;
		}
	}

	public boolean returnBook(User user) {
		if (borrowed) {
			borrowed = false;
			return user.returnBook(this);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id, title, author);
	}
}
