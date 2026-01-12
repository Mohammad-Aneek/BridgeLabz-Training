package com.dayseven.FoodLoop;

import java.util.ArrayList;

public class Order implements IOrderable {
	private boolean orderPlaced;
	private double cartValue;
	private ArrayList<FoodItem> cart;

	public Order() {
		this.cart = new ArrayList<FoodItem>();
		this.orderPlaced = false;
	}

	public void addToCart(FoodItem item) {
		if (item.isAvailable() && !orderPlaced) {
			cart.add(item);
			cartValue += item.getPrice();
			item.sell();
			System.out.println("Item added to cart");
		} else if (orderPlaced) {
			System.out.println("Order already placed.\nCancel order to add items.");
		} else {
			System.out.println("Item not available");
		}
	}

	public void addToCart(ComboMeal meal) {
		if (meal.isAvailable() && !orderPlaced) {
			cart.addAll(meal.getItems());
			cartValue += meal.getPrice();
			meal.sell();
			System.out.println("Meal added to cart");
		} else if (orderPlaced) {
			System.out.println("Order already placed.\nCancel order to add meals.");
		} else {
			System.out.println("Meal not available");
		}
	}

	public double getOrderValue() {
		return cartValue;
	}

	@Override
	public void placeOrder() {
		if (!orderPlaced) {
			System.out.println("Order placed Successfully");
		} else {
			System.out.println("Order already placed");
		}

		System.out.println("Total order value: " + getOrderValue());
		this.orderPlaced = true;
	}

	@Override
	public void cancelOrder() {
		if (orderPlaced) {
			System.out.println("Order cancelled");
			this.orderPlaced = false;
		}
	}

}
