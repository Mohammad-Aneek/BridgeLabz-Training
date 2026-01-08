package com.dayfour.EventEase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BirthdayEvent extends Event {

	public BirthdayEvent(String location, String date, Person organizer) {
		super("Birthday", location, date, 5000, organizer);
		super.needCatering(true);
		super.needDecoration(true);
	}

	@Override
	public boolean reschedule(String newDate) {
		LocalDate newLocalDate = LocalDate.parse(newDate, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		if (newLocalDate.isAfter(date)) {
			this.date = newLocalDate;
			System.out.println("Rescheduled to " + newDate);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void cancel() {
		System.out.println("Event cancelled");
	}

}
