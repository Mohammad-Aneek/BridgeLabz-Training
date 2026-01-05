package com.dayone.VehicleRentalApplication;

abstract class Vehicle implements Rentable{
	protected int maxSpeed;
	protected String fuelType;
	
	public Vehicle(int maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	public void displayInfo() {
		System.out.println("Vehicle type: " + this.getVehicleType());
		System.out.println("Max speed: " + this.maxSpeed);
		System.out.println("Fuel type: " + this.fuelType);
	}
	
	abstract String getVehicleType();
	abstract double getBaserate();

	@Override
	public double calculateRent(int days, double surcharge) {
		return days * getBaserate() + surcharge;
	}
}
