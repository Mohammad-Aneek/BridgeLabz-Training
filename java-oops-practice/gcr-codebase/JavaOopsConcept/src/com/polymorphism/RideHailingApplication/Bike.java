package com.polymorphism.RideHailingApplication;

public class Bike extends Vehicle {
	public Bike(String id, String driver) {
		super(id, driver, 10.0);
	}

	@Override
	public double calculateFare(double distance) {
		return ratePerKm * distance;
	}

	@Override
	public void displayDetails(double distance) {
		System.out.println("Vehicle: Bike");
		super.displayDetails(distance);
	}

}
