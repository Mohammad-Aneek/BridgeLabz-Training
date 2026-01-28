package com.generics.WarehouseSystem;

abstract class WarehouseItem {
	protected String name;
	protected double price;

	public WarehouseItem(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public abstract void displayDetails();
}
