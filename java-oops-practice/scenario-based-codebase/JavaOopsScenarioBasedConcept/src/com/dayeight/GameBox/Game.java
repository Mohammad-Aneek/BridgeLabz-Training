package com.dayeight.GameBox;

abstract class Game implements IDownloadable {

	protected String title;
	protected String genre;
	protected double price;
	protected double rating;

	public Game(String title, String genre, double price, double rating) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.rating = rating;
	}

	public void applySeasonalOffer(double discountPercentage) {
		double originalPrice = this.price;
		this.price = this.price - (this.price * (discountPercentage / 100));
		System.out.println("Offer Applied! " + title + " price dropped from $" + originalPrice + " to $" + this.price);
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public void download() {
		System.out.println("Downloading game assets for: " + title + "...");
	}

	@Override
	public String toString() {
		return title + " [" + genre + "]";
	}

}
