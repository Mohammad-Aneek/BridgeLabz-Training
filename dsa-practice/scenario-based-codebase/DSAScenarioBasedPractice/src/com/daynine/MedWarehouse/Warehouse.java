package com.daynine.MedWarehouse;

import java.util.ArrayList;

public class Warehouse {
	private ArrayList<Medicine> inventory;

	public Warehouse() {
		this.inventory = new ArrayList<>();
	}

	public void addBranchMedicines(Branch branch) {
		ArrayList<Medicine> branchStock = branch.getStock();
		ArrayList<Medicine> mergedInventory = new ArrayList<>();

		int pointer1 = 0, pointer2 = 0;
		int size1 = this.inventory.size(), size2 = branchStock.size();

		while (pointer1 < size1 && pointer2 < size2) {
			Medicine med1 = this.inventory.get(pointer1);
			Medicine med2 = branchStock.get(pointer2);

			if (med1.compareTo(med2) <= 0) {
				mergedInventory.add(med1);
				pointer1++;
			} else {
				mergedInventory.add(med2);
				pointer2++;
			}
		}

		while (pointer1 < size1) {
			mergedInventory.add(this.inventory.get(pointer1));
			pointer1++;
		}
		while (pointer2 < size2) {
			mergedInventory.add(branchStock.get(pointer2));
			pointer2++;
		}

		inventory = mergedInventory;
	}

	public void displayInventory() {
		for (Medicine med : inventory) {
			System.out.println(med);
		}
	}
}
