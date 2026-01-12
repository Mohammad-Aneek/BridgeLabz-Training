package com.dayseven.FoodLoop;

import java.util.ArrayList;
import java.util.Arrays;

public class ComboMeal {
	protected String name;
	ArrayList<FoodItem> items;
	protected double price;

	public ComboMeal(String name, double price, FoodItem item1, FoodItem item2, FoodItem... items) {
		this.items = new ArrayList<FoodItem>();

		this.items.add(item1);
		this.items.add(item2);
		this.items.addAll(Arrays.asList(items));

		this.price = price;
	}

	public ArrayList<FoodItem> getItems() {
		return items;
	}

	public double getPrice() {
		return this.price;
	}
	
	public boolean isAvailable() {
		boolean availability = true;

		for (FoodItem foodItem : items) {
			availability &= foodItem.isAvailable();
		}

		return availability;
	}

	public boolean sell() {
		if (isAvailable()) {
			for (FoodItem foodItem : items) {
				foodItem.sell();
			}
			return true;
		} else {
			return false;
		}
	}
}
