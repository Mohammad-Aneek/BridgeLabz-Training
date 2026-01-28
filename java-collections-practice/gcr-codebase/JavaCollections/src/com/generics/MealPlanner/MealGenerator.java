package com.generics.MealPlanner;

public class MealGenerator {
	public static <T extends MealPlan> Meal<T> generateMeal(T plan) {
		return new Meal<>(plan);
	}
}
