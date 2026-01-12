package com.dayseven.Artify;

public class Main {

	public static void main(String[] args) {
		Buyer aneek = new Buyer("Aneek", 20_000_000);
		
		Artwork digitalArt = new DigitalArt("Cyber Landscape", "Nano Banana", 600000, LicenseType.Personal, true);
		digitalArt.preview();

		Artwork printArt = new PrintArt("Mona Lisa", "Da Vinci", 19000000, LicenseType.Exclusive, false);
		printArt.preview();
		
		boolean bought = digitalArt.purchase(aneek);
		System.out.println("Purchase Successful: " + bought);

		bought= printArt.purchase(aneek);
		System.out.println("Purchase Successful: " + bought);
		
		bought= digitalArt.purchase(aneek);
		System.out.println("Purchase Successful: " + bought);
		
	}
}
