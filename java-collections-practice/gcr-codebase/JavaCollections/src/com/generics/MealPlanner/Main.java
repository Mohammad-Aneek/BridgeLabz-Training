package com.generics.MealPlanner;

public class Main {
	public static void main(String[] args) {
		Meal<VeganMeal> myLunch = MealGenerator.generateMeal(new VeganMeal());
		Meal<KetoMeal> myDinner = MealGenerator.generateMeal(new KetoMeal());

		myLunch.serve();
		myDinner.serve();
	}
}
