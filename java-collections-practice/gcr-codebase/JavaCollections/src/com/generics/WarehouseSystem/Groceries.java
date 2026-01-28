package com.generics.WarehouseSystem;

public class Groceries extends WarehouseItem {

	public Groceries(String name, double price) {
		super(name, price);
	}

	@Override
	public void displayDetails() {
		System.out.println("Type: Groceries");
		System.out.println("Name: " + this.name);
		System.out.println("Price: " + this.price);
	}

}
