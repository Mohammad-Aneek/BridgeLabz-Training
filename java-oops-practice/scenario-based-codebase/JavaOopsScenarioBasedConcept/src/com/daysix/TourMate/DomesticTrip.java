package com.daysix.TourMate;

public class DomesticTrip extends Trip {

	public DomesticTrip(String destination, Transport transport, Hotel hotel, int duration, double budget) {
		super(destination,transport,hotel,duration,budget);
	}

	@Override
	public void book() {
		if (isBooked) {
			System.out.println("Trip already booked");
		} else if (isManageable()){
			this.isBooked = true;
			System.out.println("Trip Booked");
		} else {
			System.out.println("Booking failed! Out of budget");
		}
	}

	@Override
	public void cancel() {
		if (isBooked) {
		this.isBooked = false;
		System.out.println("Trip cancelled");
		} else {
			System.out.println("No trip to cancel");
		}
	}

}
