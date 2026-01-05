package com.dayone.VehicleRentalApplication;

public class Truck extends Vehicle{
	private int wheel;
	private int baseRate = 1000;
	public Truck(int maxSpeed, String fuelType,int wheel) {
		super(maxSpeed, fuelType);
		this.wheel = wheel;
	}
	
	@Override
	public double getBaserate() {
		return baseRate;
	}
	
	@Override
	public String getVehicleType() {
		return "Bike";
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Number of Wheels: " + wheel );
		
	}
}
