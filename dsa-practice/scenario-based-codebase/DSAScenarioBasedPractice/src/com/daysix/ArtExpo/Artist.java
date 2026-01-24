package com.daysix.ArtExpo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Artist implements Comparable<Artist> {
	String name;
	LocalTime registrationTime;

	public Artist(String name, String timeStr) {
		this.name = name;
		this.registrationTime = LocalTime.parse(timeStr, DateTimeFormatter.ofPattern("HH:mm:ss"));
	}

	@Override
	public int compareTo(Artist o) {
		return o.registrationTime.compareTo(this.registrationTime);
	}

	@Override
	public String toString() {
		return name + " [" + registrationTime.format(DateTimeFormatter.ofPattern("hh:mm a")) + "]";
	}
}
