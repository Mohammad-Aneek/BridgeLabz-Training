package com.inheritance.LibraryManagement;

public class Author extends Book {
	protected String name;
	protected String bio;

	public Author(String title, int publicationYear, String name, String bio) {
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Author name: " + name);
		System.out.println("Bio: " + bio);
	}

}
