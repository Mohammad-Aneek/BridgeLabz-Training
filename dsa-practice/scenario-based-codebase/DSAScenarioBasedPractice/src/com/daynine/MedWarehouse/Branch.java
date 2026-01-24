package com.daynine.MedWarehouse;

import java.util.ArrayList;

public class Branch {
	private String branchName;
	private ArrayList<Medicine> stock;

	public Branch(String branchName) {
		this.branchName = branchName;
		this.stock = new ArrayList<Medicine>();
	}

	public void addMedicine(Medicine medicine) {
		int idx = stock.size() - 1;
		while (idx >= 0 && stock.get(idx).compareTo(medicine) > 0) {
			idx--;
		}
		stock.add(idx + 1, medicine);
	}

	public ArrayList<Medicine> getStock() {
		return stock;
	}

}
