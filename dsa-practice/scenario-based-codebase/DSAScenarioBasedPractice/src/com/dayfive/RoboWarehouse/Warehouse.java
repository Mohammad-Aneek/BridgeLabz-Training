package com.dayfive.RoboWarehouse;

import java.util.ArrayList;

public class Warehouse {
	private ArrayList<Package> shelf;

	public Warehouse() {
		this.shelf = new ArrayList<>();
	}

	public void loadPackage(String id, double weight) {
		Package newPkg = new Package(id, weight);
		int i = shelf.size() - 1;
		for (; i >= 0; i--) {
			if (shelf.get(i).compareTo(newPkg) <= 0) {
				break;
			}
		}

		shelf.add(i + 1, newPkg);
	}

	public void display() {
		System.out.println("Warehoue: ");
		for (Package package1 : shelf) {
			System.out.println(package1);
		}
	}
}
