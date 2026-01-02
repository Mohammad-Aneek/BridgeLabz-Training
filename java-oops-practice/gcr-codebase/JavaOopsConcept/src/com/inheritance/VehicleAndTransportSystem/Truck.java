package com.inheritance.VehicleAndTransportSystem;

public class Truck extends Vehicle {
	protected double loadCapacity;
	
	public Truck(int maxSpeed, String fuelType,double loadCapacity) {
		super(maxSpeed, fuelType);
		this.loadCapacity = loadCapacity;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Truck details: ");
		super.displayInfo();
		System.out.println("Load Capacity: " + loadCapacity);
	}
}
