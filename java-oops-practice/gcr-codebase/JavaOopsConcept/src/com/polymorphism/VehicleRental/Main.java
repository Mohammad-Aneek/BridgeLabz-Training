package com.polymorphism.VehicleRental;

public class Main {

	public static void main(String[] args) {
		Vehicle car = new Car("MP-1", 1000, "POL-999");
		Vehicle bike = new Bike("MP-2", 300, "POL-888");
		Vehicle truck = new Truck("MP-3", 2000, "POL-777");

		System.out.println("----------------------------");
		car.displayDetails(5);
		System.out.println("----------------------------");
		bike.displayDetails(5);
		System.out.println("----------------------------");
		truck.displayDetails(5);
	}
}
