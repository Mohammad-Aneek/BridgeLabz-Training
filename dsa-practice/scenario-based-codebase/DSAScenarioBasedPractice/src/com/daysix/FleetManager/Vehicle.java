package com.daysix.FleetManager;

public class Vehicle implements Comparable<Vehicle> {
	protected int id;
	protected int mileage;

	private static int counter = 0;

	public Vehicle(int mileage) {
		this.id = ++counter;
		this.mileage = mileage;
	}

	@Override
	public int compareTo(Vehicle o) {
		return this.mileage - o.mileage;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Mileage: " + mileage;
	}
}
