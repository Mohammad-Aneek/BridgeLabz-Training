package com.dayeight.MovieTime;

import java.util.ArrayList;

public class Schedule {
	protected ArrayList<Show> shows;

	public Schedule() {
		this.shows = new ArrayList<Show>();
	}

	public void addShow(String movieName, String timeStr) {
		Show newShow = new Show(movieName, timeStr);

		int i = shows.size() - 1;
		for (; i >= 0; i--) {
			if (newShow.compareTo(shows.get(i)) >= 0) {
				break;
			}
		}
		shows.add(i + 1, newShow);
	}

	public void display() {
		System.out.println("Today's Showtimes: ");
		for (Show show : shows) {
			System.out.println(show);
		}
	}
}
