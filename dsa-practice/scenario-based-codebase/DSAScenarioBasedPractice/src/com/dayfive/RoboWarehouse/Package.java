package com.dayfive.RoboWarehouse;

public class Package implements Comparable<Package> {
	protected String id;
	protected double weight;

	public Package(String id, double weight) {
		this.id = id;
		this.weight = weight;
	}

	@Override
	public int compareTo(Package o) {
		if (this.weight < o.weight) {
			return -1;
		} else if (this.weight > o.weight) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return String.format("ID: %s, Weight: %.2f", id, weight);
	}
}
