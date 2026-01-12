package com.dayseven.FoodLoop;

public class NonVegItem extends FoodItem {
	public NonVegItem(String name, double price, int stock) {
		super(name, Category.NonVeg, price, stock);
	}
}
