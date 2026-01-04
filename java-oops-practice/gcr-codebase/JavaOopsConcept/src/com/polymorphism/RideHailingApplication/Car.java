package com.polymorphism.RideHailingApplication;

public class Car extends Vehicle {
	public Car(String id, String driver) {
		super(id, driver, 20.0);
	}

	@Override
	public double calculateFare(double distance) {
		return 50 + (ratePerKm * distance);
	}

	@Override
	public void displayDetails(double distance) {
		System.out.println("Vehicle: Car");
		super.displayDetails(distance);
	}
}
