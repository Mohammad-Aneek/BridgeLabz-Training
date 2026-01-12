package com.dayseven.Artify;

public class DigitalArt extends Artwork {

	public DigitalArt(String title, String artist, double price, LicenseType licenseType, boolean preview) {
		super(title, artist, price, licenseType, preview);
		this.license(licenseType);
	}

	@Override
	public void license(LicenseType licenseType) {
		this.licensingTerms = switch (this.licenseType) {
		case Personal -> {
			yield "Only for personal use";
		}
		case Commercial -> {
			yield "For commercial use";
		}
		case Exclusive -> {
			yield "Full copyright transfer. Only a single copy exists";
		}
		case Limited_Edition -> {
			yield "Limited edition copy";
		}
		};
	}
	
	@Override
	public void preview() {
		System.out.println("Title: " + this.title);
		if (previewAvailable) {
			System.out.println("Preview available via url: xyz.preview.com");			
		} else {
			System.out.println("No preview available");
		}
	}

}
