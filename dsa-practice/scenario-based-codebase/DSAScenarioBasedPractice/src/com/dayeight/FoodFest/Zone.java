package com.dayeight.FoodFest;

import java.util.ArrayList;

public class Zone {
	private String name;
	private ArrayList<Stall> stalls;

	public Zone(String name) {
		this.name = name;
		this.stalls = new ArrayList<Stall>();
	}

	public ArrayList<Stall> getStalls() {
		return stalls;
	}

	public void addStall(Stall stall) {
		int i = stalls.size() - 1;

		while (i >= 0 && stalls.get(i).compareTo(stall) > 0) {
			i--;
		}

		stalls.add(i + 1, stall);
	}

	@Override
	public String toString() {
		return "Zone: " + name + ", Stalls: " + stalls.size();
	}

	public void displayStalls() {
		System.out.println("Zone: " + name);
		for (Stall stall : stalls) {
			System.out.println(stall);
		}
	}
}