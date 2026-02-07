package com.functionalinterface.VehicleRental;

class Car implements Rental {
	@Override
	public void rent(int days) {
		System.out.println("Car rented for " + days + " days.");
	}

	@Override
	public void returnVehicle() {
		System.out.println("Car returned. Inspecting for damages...");
	}
}