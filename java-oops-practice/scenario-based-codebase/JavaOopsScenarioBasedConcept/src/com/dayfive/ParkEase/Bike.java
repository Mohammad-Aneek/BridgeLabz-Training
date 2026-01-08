package com.dayfive.ParkEase;

import java.time.Duration;

public class Bike extends Vehicle {
	private final double HOURLY_RATE = 10;
	private final double PENALTY = 20;

	public Bike(String registrationNumber) {
		super(registrationNumber, VehicleType.Bike);
	}

	@Override
	public double calculateCharges(Duration duration) {
		long durationInHours = duration.toHours();
		double cost = durationInHours * HOURLY_RATE;
		if (durationInHours > 5) {
			cost += PENALTY;
		}
		return cost;
	}
}
