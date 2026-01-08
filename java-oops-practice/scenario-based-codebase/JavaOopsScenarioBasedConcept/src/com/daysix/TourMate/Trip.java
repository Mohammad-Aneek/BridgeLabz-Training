package com.daysix.TourMate;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

abstract class Trip implements IBookable {
	protected String destination;
	protected Duration duration;
	protected double budget;

	protected Transport transport;
	protected Hotel hotel;
	protected List<Activity> activities;
	
	protected boolean isBooked;

	// Constructor to generate complete trip package
	public Trip(String destination, Transport transport, Hotel hotel, int duration, double budget) {
		this.destination = destination;
		this.transport = transport;
		this.hotel = hotel;
		this.duration = Duration.ofDays(duration);
		this.budget = budget;
		this.activities = new ArrayList<>();
		this.isBooked = false;
	}

	public void addActivity(Activity activity) {
		if (!activities.contains(activity)) {
			activities.add(activity);			
		}
	}

	public double calculateTotalCost() {
		double activityCost = 0;
		for (Activity a : activities) {
			activityCost += a.getCost();
		}
		return transport.getCost() + hotel.getCost() + activityCost;
	}

	public void showDetails() {
		System.out.println("Destination: " + destination);
		System.out.println("Duration (in days): " + duration.toDays());
		System.out.println("Transport: " + transport);
		System.out.println("Hotel: " + hotel);
		System.out.println("Activities: " + activities);
		System.out.println("Total Cost: " + calculateTotalCost());

		if (calculateTotalCost() > budget) {
			System.out.println("You are over budget by " + (calculateTotalCost() - budget));
		} else {
			System.out.println("Ready to enjoy :)");
		}
	}
	
	public boolean isManageable() {
		return calculateTotalCost() <= budget;
	}

}
