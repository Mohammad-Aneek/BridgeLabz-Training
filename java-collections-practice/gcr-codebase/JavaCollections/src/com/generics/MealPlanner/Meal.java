package com.generics.MealPlanner;

public class Meal<T extends MealPlan> {
	private T plan;

	public Meal(T plan) {
		this.plan = plan;
	}

	public void serve() {
		System.out.print("Serving Meal -> ");
		plan.printIngredients();
	}
}
