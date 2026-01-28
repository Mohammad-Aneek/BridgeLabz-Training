package com.generics.MealPlanner;

public class VeganMeal implements MealPlan {

	@Override
	public void printIngredients() {
		System.out.println("Vegan: Tofu, Quinoa, Spinach");
	}

}
