package com.collectors.LibraryStatistics;

public class Book {
    String title;
    String genre;
    int pages;

    public Book(String title, String genre, int pages) {
	this.title = title;
	this.genre = genre;
	this.pages = pages;
    }

    @Override
    public String toString() {
	return title + " (" + pages + " pages)";
    }
}
