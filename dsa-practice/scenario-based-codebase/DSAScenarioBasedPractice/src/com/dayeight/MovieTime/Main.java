package com.dayeight.MovieTime;

public class Main {
	public static void main(String[] args) {
		Schedule schedule = new Schedule();

		schedule.addShow("Avengers", "10:00");
		schedule.addShow("Batman", "09:30");
		schedule.addShow("Spider-Man", "14:00");
		schedule.addShow("Inception", "12:15");

		schedule.display();
	}
}

//dummy nodes 
//pojo class
//Inner classes