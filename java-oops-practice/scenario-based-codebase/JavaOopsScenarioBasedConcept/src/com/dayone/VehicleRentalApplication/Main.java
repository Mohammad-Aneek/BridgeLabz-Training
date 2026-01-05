package com.dayone.VehicleRentalApplication;

public class Main {
	public static void main(String[] args) {
		Vehicle car = new Car(200, "Petrol", 6);
		Vehicle truck = new Truck(100, "Diesel", 12);
		Vehicle bike = new Bike(120, "Petrol");

		Customer customer = new Customer("Aneek", 21);

		customer.rentVehicle(bike);
		System.out.println("Renting Bike for 5 days total charges: " + customer.calculateRent(5, 100));
		customer.returnVehicle();

		customer.rentVehicle(car);
		System.out.println("Renting Car for 2 days total charges: " + customer.calculateRent(2, 200));
		customer.returnVehicle();

		customer.rentVehicle(truck);
		System.out.println("Renting Truck for 10 days total charges: " + customer.calculateRent(10, 1000));
		customer.returnVehicle();
	}
}
