package com.dayfour.EventEase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

abstract class Event implements ISchedulable {
	// static counter variable to generate unique id for events
	private static int counter = 0;

	// even details
	private final int eventId;
	protected String eventName;
	protected String location;
	protected LocalDate date;

	// related persons
	protected Person organizer;
	protected ArrayList<Person> attendees;

	// cost related details
	private double cost;
	private boolean hasCatering;
	private boolean hasDecoration;

	public Event(String eventName, String location, String date, double baseCost, Person organizer) {
		this.eventId = ++counter;

		this.eventName = eventName;
		this.location = location;
		this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM-dd-yyyy"));

		this.cost = baseCost;
		this.hasCatering = false;
		this.hasDecoration = false;

		this.organizer = organizer;
		this.attendees = new ArrayList<Person>();
	}

	// to set if catering needed or not
	public void needCatering(boolean choice) {
		this.hasCatering = choice;
	}

	// to set if decoration needed or not
	public void needDecoration(boolean choice) {
		this.hasDecoration = choice;
	}

	// to calculate cost
	public double calculateTotalCost(double discount) {
		double total = cost;
		if (hasCatering)
			total += 20000;
		if (hasDecoration)
			total += 10000;

		return total - discount;
	}

	public void addAttendee(Person p) {
		if (!attendees.contains(p)) {
			attendees.add(p);
		}
	}

	@Override
	public void schedule() {
		System.out.println("Event: " + eventName);
		System.out.println("Event Date: " + date);
		System.out.println("Event location: " + location);
	}

	public void display(double discount) {
		schedule();
		System.out.println("Total cost: " + calculateTotalCost(discount));
	}
}
