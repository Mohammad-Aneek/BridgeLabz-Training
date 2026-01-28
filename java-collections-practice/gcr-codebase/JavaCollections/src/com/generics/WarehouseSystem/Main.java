package com.generics.WarehouseSystem;

public class Main {
	public static void main(String[] args) {
		Storage<Electronics> eStorage = new Storage<>();
		eStorage.addItem(new Electronics("Laptop", 70000.00));
		eStorage.addItem(new Electronics("Smart Watch", 2500.00));

		Storage<Groceries> gStorage = new Storage<>();
		gStorage.addItem(new Groceries("Apples", 150.00));

		WarehouseUtility.printInventory(eStorage.getAllItems());
		System.out.println();
		WarehouseUtility.printInventory(gStorage.getAllItems());
	}
}
