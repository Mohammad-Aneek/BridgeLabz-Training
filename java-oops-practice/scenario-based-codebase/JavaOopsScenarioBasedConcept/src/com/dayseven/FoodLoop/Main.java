package com.dayseven.FoodLoop;

public class Main {

	public static void main(String[] args) {
		VegItem burger = new VegItem("Veggie Burger", 150, 1);
		VegItem fries = new VegItem("Crispy Fries", 100, 10);
		NonVegItem chicken = new NonVegItem("Grilled Chicken", 250, 10);
		VegItem soda = new VegItem("Cola", 60, 10);

		ComboMeal valueMeal = new ComboMeal("Happy Lunch", 250, burger, fries, soda);

		Order myOrder = new Order();

		myOrder.addToCart(chicken);
		myOrder.addToCart(valueMeal);
		myOrder.placeOrder();

		myOrder.placeOrder();
		myOrder.cancelOrder();

		myOrder.addToCart(soda);
		myOrder.addToCart(burger);
		myOrder.placeOrder();

	}

}
