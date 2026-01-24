package com.dayeight.MovieTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Show implements Comparable<Show> {
	String movieName;
	LocalTime startTime;

	public Show(String movieName, String timeStr) {
		this.movieName = movieName;
		this.startTime = LocalTime.parse(timeStr, DateTimeFormatter.ofPattern("HH:mm"));
	}

	@Override
	public int compareTo(Show o) {
		return this.startTime.compareTo(o.startTime);
	}

	@Override
	public String toString() {
		return movieName + " [" + startTime + "]";
	}
}