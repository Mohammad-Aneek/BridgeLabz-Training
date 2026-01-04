package com.polymorphism.OnlineFoodDelivery;

public class Main {

	public static void main(String[] args) {
		FoodItem vegItem = new VegItem("Paneer Tikka", 250, 2);
		FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 350, 1);

		System.out.println("----------------------------");
		vegItem.displayDetails();
		System.out.println("----------------------------");
		nonVegItem.displayDetails();
	}
}
