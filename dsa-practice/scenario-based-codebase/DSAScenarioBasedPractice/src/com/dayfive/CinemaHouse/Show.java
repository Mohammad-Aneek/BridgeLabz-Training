package com.dayfive.CinemaHouse;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Show {
	String title;
	LocalTime showTime;

	public Show(String title, String showTime) {
		this.title = title;
		this.showTime = LocalTime.parse(showTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
	}

	@Override
	public String toString() {
		return title + " [" + showTime.format(DateTimeFormatter.ofPattern("hh:mm a")) + "]";
	}
}
