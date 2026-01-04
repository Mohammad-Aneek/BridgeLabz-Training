package com.polymorphism.VehicleRental;

public class Truck extends Vehicle {
	public Truck(String number, double rate, String policy) {
		super(number, "Truck", rate, policy);
	}

	@Override
	public double calculateRentalCost(int days) {
		return (rentalRate * days) + 1000;
	}

	@Override
	public double calculateInsurance() {
		return 1500.0;
	}
}
