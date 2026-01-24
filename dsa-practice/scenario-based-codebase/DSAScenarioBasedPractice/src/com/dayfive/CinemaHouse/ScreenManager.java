package com.dayfive.CinemaHouse;

public class ScreenManager {
	public static void bubbleSort(Show[] shows) {
		int n = shows.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - i - 1; j++) {
				// Swap if the current show is later than the next show
				if (shows[j].showTime.isAfter(shows[j + 1].showTime)) {
					Show temp = shows[j];
					shows[j] = shows[j + 1];
					shows[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped)
				break;
		}
	}

}
