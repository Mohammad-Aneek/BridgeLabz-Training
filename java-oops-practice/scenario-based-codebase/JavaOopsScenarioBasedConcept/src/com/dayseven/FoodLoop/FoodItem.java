package com.dayseven.FoodLoop;

abstract class FoodItem {
	protected String name;
	protected Category category;
	protected double price;
	protected int stock;

	public FoodItem(String name, Category category, double price, int stock) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock= stock;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public boolean isAvailable() {
		if (this.stock > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean sell() {
		if (isAvailable()) {
			this.stock--;
			return true;
		} else {
			return false;
		}
	}
}
