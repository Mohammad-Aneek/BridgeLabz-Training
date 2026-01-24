package com.dayeight.FoodFest;

public class Stall implements Comparable<Stall> {
	private int id;
	private int footfall;

	public Stall(int id, int footfall) {
		this.id = id;
		this.footfall = footfall;
	}

	@Override
	public int compareTo(Stall other) {
		return other.footfall - this.footfall;
	}

	@Override
	public String toString() {
		return "Stall ID: " + id + ", Footfall: " + footfall;
	}
}
