package com.dayone.VehicleRentalApplication;

public class Car extends Vehicle{
	private int seatCapacity;
	private int baseRate = 500;
	
	public Car(int maxSpeed, String fuelType, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
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
		System.out.println("Seat Capacity: " + seatCapacity );
		
	}
}
