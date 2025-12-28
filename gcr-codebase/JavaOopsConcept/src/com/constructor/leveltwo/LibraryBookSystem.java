package com.constructor.leveltwo;

class LibraryBookSystem {
	public String ISBN;
	protected String title;
	private String author;
	
	public LibraryBookSystem(String ISBN, String title, String author) {
		this.ISBN =ISBN;
		this.title= title;
		this.author = author;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void updateAuthor(String author) {
		this.author = author;
	}
}
