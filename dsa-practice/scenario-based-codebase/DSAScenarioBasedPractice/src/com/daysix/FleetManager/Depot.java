package com.daysix.FleetManager;

import java.util.ArrayList;

public class Depot {
	protected ArrayList<Vehicle> vehicles;

	public Depot() {
		this.vehicles = new ArrayList<Vehicle>();
	}

	public void addVehicle(int mileage) {
		Vehicle vehicle = new Vehicle(mileage);

		int i = vehicles.size() - 1;
		for (; i >= 0; i--) {
			if (vehicle.compareTo(vehicles.get(i)) <= 0) {
				break;
			}
		}
		vehicles.add(i + 1, vehicle);
	}
}
