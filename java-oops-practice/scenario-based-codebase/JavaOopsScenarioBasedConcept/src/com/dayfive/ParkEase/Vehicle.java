package com.dayfive.ParkEase;

abstract class Vehicle implements IPayable {
	protected String registrationNumber;
	protected VehicleType type;

	public Vehicle(String registrationNumber, VehicleType type) {
		this.registrationNumber = registrationNumber;
		this.type = type;
	}

	public VehicleType getVehicleType() {
		return type;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}
}
