package com.inheritance.VehicleAndTransportSystem;

public class Main {
	public static void main(String[] args) {
		// Creating object of different vehicle class
		Vehicle vehicle1 = new Car(200, "Petrol", "Black");
		Vehicle vehicle2 = new Truck(100, "Diesel", 12);
		Vehicle vehicle3 = new Motorcycle(120, "Petrol", "Yes");

		vehicle1.displayInfo();
		vehicle2.displayInfo();
		vehicle3.displayInfo();
	}

}
