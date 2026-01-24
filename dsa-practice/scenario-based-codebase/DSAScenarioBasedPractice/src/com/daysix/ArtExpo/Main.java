package com.daysix.ArtExpo;

public class Main {
	public static void main(String[] args) {
		Expo artExpo = new Expo();

		artExpo.registerArtist("Picasso", "10:00:00");
		artExpo.registerArtist("Van Gogh", "09:00:00");
		artExpo.registerArtist("Da Vinci", "12:00:00");
		artExpo.registerArtist("Monet", "10:30:00");

		artExpo.display();
	}
}
