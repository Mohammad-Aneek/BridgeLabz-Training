package com.functionalinterface.VehicleDashboard;

public class Main {
	public static void main(String[] args) {
		Dashboard tesla = new ElectricCar();
		tesla.displayBattery();

		Dashboard truck = new DieselTruck();
		truck.displayBattery();
	}
}
