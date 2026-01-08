package com.dayfive.ParkEase;

import java.time.Duration;

public class Truck extends Vehicle {
	private final double HOURLY_RATE = 20;
	private final double PENALTY = 50;

	public Truck(String registrationNumber) {
		super(registrationNumber, VehicleType.Truck);
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
