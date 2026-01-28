package com.generics.WarehouseSystem;

public class Electronics extends WarehouseItem {
	public Electronics(String name, double price) {
		super(name, price);
	}

	@Override
	public void displayDetails() {
		System.out.println("Type: Electronics");
		System.out.println("Name: " + this.name);
		System.out.println("Price: " + this.price);
	}

}
