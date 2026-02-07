package com.functionalinterface.VehicleDashboard;

public class ElectricCar implements Dashboard {
	public void displaySpeed() {
		System.out.println("Speed: 80 km/h");
	}

	@Override
	public void displayBattery() {
		System.out.println("Battery: 85%");
	}
}
