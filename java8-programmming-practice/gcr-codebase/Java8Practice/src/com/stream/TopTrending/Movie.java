package com.stream.TopTrending;

public class Movie {
	String title;
	double rating;
	int year;

	public Movie(String title, double rating, int year) {
		this.title = title;
		this.rating = rating;
		this.year = year;
	}

	public String toString() {
		return title + " (" + rating + ")";
	}
}