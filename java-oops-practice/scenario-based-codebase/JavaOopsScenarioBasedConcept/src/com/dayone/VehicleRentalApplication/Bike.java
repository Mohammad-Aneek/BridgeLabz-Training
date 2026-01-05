package com.dayone.VehicleRentalApplication;

public class Bike extends Vehicle{
	private int baseRate = 250;
	
	public Bike(int maxSpeed, String fuelType) {
		super(maxSpeed, fuelType);
	}
	
	@Override
	public double getBaserate() {
		return baseRate;
	}
	
	@Override
	public String getVehicleType() {
		return "Bike";
	}
}
