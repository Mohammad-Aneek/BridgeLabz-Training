package com.dayone.VehicleRentalApplication;

public class Customer {
	private String name;
	private int age;
	private Vehicle vehicle;

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.vehicle = null;
	}

	public double calculateRent(int days, double surcharge) {
		if (vehicle == null) {
			return 0;
		} else {

			return vehicle.calculateRent(days, surcharge);
		}
	}

	public void rentVehicle(Vehicle vehicle) {
		if (this.vehicle != null) {
			System.out.println("Vehicle already rented");
		} else {
			this.vehicle = vehicle;
			System.out.println("Vehicle rented successfully");
		}
	}

	public void returnVehicle() {
		if (this.vehicle == null) {
			System.out.println("No vehicle rented");
		} else {
			this.vehicle = null;
			System.out.println("Vehicle returned successfully");
		}
	}

	void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		if (vehicle != null) {
			vehicle.displayInfo();
		}
	}
}
