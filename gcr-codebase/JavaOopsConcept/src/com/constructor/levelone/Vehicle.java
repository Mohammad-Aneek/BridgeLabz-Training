package com.constructor.levelone;

class Vehicle {
	private String ownerName;
	private String vehicleType;
	private static double registrationFee;
	
	Vehicle(String ownerName, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	public void displayVehicleDetails() {
		System.out.println("Owner name: " + ownerName);
		System.out.println("Vehicle type: " + vehicleType);
		System.out.println("Registration fee: " + registrationFee);
	}
	
	public void updateRegistrationFee(double registrationFee) {
		Vehicle.registrationFee = registrationFee;
	}
}
