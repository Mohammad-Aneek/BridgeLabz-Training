package com.polymorphism.RideHailingApplication;

public class Main {
	public static void main(String[] args) {
		Vehicle carRide = new Car("CAR-101", "Alice");
		Vehicle bikeRide = new Bike("BIKE-202", "Bob");
		Vehicle autoRide = new Auto("AUTO-303", "Charlie");

		double tripDistance = 15.5;
		System.out.println("----------------------------");
		carRide.updateLocation("Lake City");
		carRide.displayDetails(tripDistance);

		System.out.println("----------------------------");
		bikeRide.updateLocation("Lake City");
		bikeRide.displayDetails(tripDistance);

		System.out.println("----------------------------");
		autoRide.updateLocation("Lake City");
		autoRide.displayDetails(tripDistance);

	}
}
