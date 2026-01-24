package com.daysix.FleetManager;

import java.util.ArrayList;

public class Scheduler {
	protected ArrayList<Vehicle> vehicles;

	public Scheduler() {
		this.vehicles = new ArrayList<Vehicle>();
	}

	public void addDepot(Depot depot) {
		ArrayList<Vehicle> arr = depot.vehicles;

		int ptr1 = 0, size1 = vehicles.size();
		int ptr2 = 0, size2 = arr.size();

		ArrayList<Vehicle> temp = new ArrayList<Vehicle>();

		while (ptr1 < size1 && ptr2 < size2) {
			if (vehicles.get(ptr1).compareTo(arr.get(ptr2)) > 0) {
				temp.add(vehicles.get(ptr1++));
			} else {
				temp.add(arr.get(ptr2++));
			}
		}

		while (ptr1 < size1) {
			temp.add(vehicles.get(ptr1++));
		}

		while (ptr2 < size2) {
			temp.add(arr.get(ptr2++));
		}

		vehicles = temp;
	}

	public void display() {
		System.out.println("Vehicle list: ");
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}
}
