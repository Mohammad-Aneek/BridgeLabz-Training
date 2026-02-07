package com.functionalinterface.VehicleRental;

class Bike implements Rental {
	@Override
	public void rent(int days) {
		System.out.println("Bike rented for " + days + " days.");
	}

	@Override
	public void returnVehicle() {
		System.out.println("Bike returned.");
	}
}
