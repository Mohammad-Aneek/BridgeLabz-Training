package com.generics.WarehouseSystem;

public class Furniture extends WarehouseItem {
	public Furniture(String name, double price) {
		super(name, price);
	}

	@Override
	public void displayDetails() {
		System.out.println("Type: Furniture");
		System.out.println("Name: " + this.name);
		System.out.println("Price: " + this.price);
	}
}
