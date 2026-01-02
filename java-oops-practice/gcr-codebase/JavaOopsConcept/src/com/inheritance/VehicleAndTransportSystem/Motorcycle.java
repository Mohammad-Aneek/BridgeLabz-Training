package com.inheritance.VehicleAndTransportSystem;

public class Motorcycle extends Vehicle {
	protected String color;
	
	public Motorcycle(int maxSpeed, String fuelType, String color) {
		super(maxSpeed,fuelType);
		this.color = color;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Motor Cycle details: ");
		super.displayInfo();
		System.out.println("Color color");
	}
}
