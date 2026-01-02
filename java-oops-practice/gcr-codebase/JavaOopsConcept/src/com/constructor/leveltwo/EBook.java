package com.constructor.leveltwo;

public class EBook extends LibraryBookSystem{
	public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title); 
        System.out.println("Author: " + getAuthor()); 
    }
}
