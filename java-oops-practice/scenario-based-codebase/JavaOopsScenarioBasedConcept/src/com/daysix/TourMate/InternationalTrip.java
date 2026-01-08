package com.daysix.TourMate;

public class InternationalTrip extends Trip {

	private Passport passport;

	public InternationalTrip(String destination, Transport transport, Hotel hotel, int duration, double budget,
			Passport passport) {
		super(destination, transport, hotel, duration, budget);
		this.passport = passport;
	}

	@Override
	public void book() {
		if (isBooked) {
			System.out.println("Trip already booked");
		} else if (passport != null && passport.isValid() && isManageable()){
			this.isBooked = true;
			System.out.println("Trip Booked");
		} else {
			System.out.println("Booking failed!");
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
