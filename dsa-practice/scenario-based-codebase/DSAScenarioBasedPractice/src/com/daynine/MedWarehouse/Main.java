package com.daynine.MedWarehouse;

public class Main {
	public static void main(String[] args) {

		Warehouse warehouse = new Warehouse();

		Branch branchA = new Branch("Branch A");
		branchA.addMedicine(new Medicine("Paracetamol", "12-31-2024"));
		branchA.addMedicine(new Medicine("Ibuprofen", "11-30-2024"));
		branchA.addMedicine(new Medicine("Aspirin", "10-15-2024"));

		Branch branchB = new Branch("Branch B");
		branchB.addMedicine(new Medicine("Amoxicillin", "09-20-2024"));
		branchB.addMedicine(new Medicine("Ciprofloxacin", "08-25-2024"));
		branchB.addMedicine(new Medicine("Doxycycline", "07-30-2024"));

		warehouse.addBranchMedicines(branchA);
		warehouse.addBranchMedicines(branchB);

		warehouse.displayInventory();
	}
}
