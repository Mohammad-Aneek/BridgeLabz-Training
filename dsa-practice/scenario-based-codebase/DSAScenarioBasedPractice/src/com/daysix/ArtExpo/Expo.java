package com.daysix.ArtExpo;

import java.util.ArrayList;

public class Expo {
	protected ArrayList<Artist> artists;

	public Expo() {
		this.artists = new ArrayList<Artist>();
	}

	public void registerArtist(String name, String timeStr) {
		Artist artist = new Artist(name, timeStr);
		
		int i = artists.size() - 1;
		for (; i >= 0; i--) {
			if (artist.compareTo(artists.get(i)) <= 0) {
				break;
			}
		}
		artists.add(i + 1, artist);
	}

	public void display() {
		System.out.println("Artists: ");
		for (Artist artist : artists) {
			System.out.println(artist);
		}
	}
}
