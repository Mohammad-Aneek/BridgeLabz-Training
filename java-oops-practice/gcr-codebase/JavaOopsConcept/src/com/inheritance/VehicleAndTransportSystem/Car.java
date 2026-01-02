package com.inheritance.VehicleAndTransportSystem;

public class Car extends Vehicle {
	protected String color;
	
	public Car(int maxSpeed, String fuelType,  String color) {
		super(maxSpeed, fuelType);
		this.color = color;
	}

	@Override
	public void displayInfo() {
		System.out.println("Car details: ");
		super.displayInfo();
		System.out.println("Color: " + color);
	}
}
