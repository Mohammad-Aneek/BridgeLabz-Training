package com.functionalinterface.VehicleRental;

public class Main {
	public static void main(String[] args) {
		Rental myCar = new Car();
		myCar.rent(3);
		myCar.returnVehicle();

		Rental myBike = new Bike();
		myBike.rent(2);
		myBike.returnVehicle();
	}
}
