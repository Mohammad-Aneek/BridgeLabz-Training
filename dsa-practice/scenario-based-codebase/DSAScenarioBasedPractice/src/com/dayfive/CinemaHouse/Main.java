package com.dayfive.CinemaHouse;

public class Main {
	public static void main(String[] args) {
		Show[] dailySchedule = { new Show("Inception", "18:30:00"), new Show("The Lion King", "09:00:00"),
				new Show("Interstellar", "14:15:00"), new Show("Avengers", "21:45:00"),
				new Show("Frozen", "11:30:00") };

		for (Show show : dailySchedule) {
			System.out.println(show);
		}

		ScreenManager.bubbleSort(dailySchedule);

		System.out.println();
		for (Show show : dailySchedule) {
			System.out.println(show);
		}
	}
}
