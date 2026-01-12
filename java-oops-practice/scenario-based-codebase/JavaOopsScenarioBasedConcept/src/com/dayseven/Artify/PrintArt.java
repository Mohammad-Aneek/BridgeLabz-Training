package com.dayseven.Artify;

public class PrintArt extends Artwork {
	public PrintArt(String title, String artist, double price, LicenseType licenseType, boolean preview) {
		super(title, artist, price, licenseType, preview);
		this.license(licenseType);
	}

	@Override
	public void license(LicenseType licenseType) {
		this.licensingTerms = switch (this.licenseType) {
		case Personal -> {
			yield "You own the item";
		}
		case Commercial -> {
			yield "For commercial use.";
		}
		case Exclusive -> {
			yield "Original Work";
		}
		case Limited_Edition -> {
			yield "Limited editition copy";
		}
		};
	}

	@Override
	public void preview() {
		System.out.println("Title: " + this.title);
		if (previewAvailable) {
			System.out.println("Preview available via Exhibition");
		} else {
			System.out.println("No preview available");
		}
	}
}
