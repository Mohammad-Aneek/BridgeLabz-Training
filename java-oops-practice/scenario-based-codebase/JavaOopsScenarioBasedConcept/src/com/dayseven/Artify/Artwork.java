package com.dayseven.Artify;

abstract class Artwork implements IPurchasable {
	protected String title;
	protected String artist;
	protected double price;
	protected LicenseType licenseType;

	protected String licensingTerms;
	protected boolean previewAvailable;

	public Artwork(String title, String artist, double price, LicenseType licenseType, boolean preview) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
		this.previewAvailable = preview;
	}

	@Override
	public boolean purchase(Buyer buyer) {
		if (buyer.deductMoney(price)) {
			return true;
		} else {
			return false;
		}
	}

	public abstract void preview();
}
