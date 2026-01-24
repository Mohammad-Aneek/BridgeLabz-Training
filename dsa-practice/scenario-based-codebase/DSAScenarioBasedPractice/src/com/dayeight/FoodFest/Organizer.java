package com.dayeight.FoodFest;

import java.util.ArrayList;

public class Organizer {
	private ArrayList<Stall> stalls;

	public Organizer() {
		this.stalls = new ArrayList<Stall>();
	}

	public void addZone(Zone zone) {
		ArrayList<Stall> zoneStalls = zone.getStalls();
		ArrayList<Stall> merged = new ArrayList<Stall>();

		int pointer1 = 0, pointer2 = 0;
		int size1 = this.stalls.size(), size2 = zoneStalls.size();

		while (pointer1 < size1 && pointer2 < size2) {
			Stall stall1 = this.stalls.get(pointer1);
			Stall stall2 = zoneStalls.get(pointer2);

			if (stall1.compareTo(stall2) <= 0) {
				merged.add(stall1);
				pointer1++;
			} else {
				merged.add(stall2);
				pointer2++;
			}
		}

		while (pointer1 < size1) {
			merged.add(this.stalls.get(pointer1));
			pointer1++;
		}

		while (pointer2 < size2) {
			merged.add(zoneStalls.get(pointer2));
			pointer2++;
		}

		this.stalls = merged;
	}

	public void displayAllStalls() {
		System.out.println("All Stalls in Organizer:");
		for (Stall stall : stalls) {
			System.out.println(stall);
		}
	}
}