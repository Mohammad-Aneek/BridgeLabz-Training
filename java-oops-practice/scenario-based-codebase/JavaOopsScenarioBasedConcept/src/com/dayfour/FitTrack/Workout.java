package com.dayfour.FitTrack;

import java.time.Duration;

abstract class Workout implements ITrackable {
	protected String type;
	protected Duration duration;
	protected double caloriesBurned;
	protected boolean isCompleted;
	protected int sets = 0;

	public Workout(String type, Duration duration) {
		this.type = type;
		this.duration = duration;
		caloriesBurned = 0;
	}

	@Override
	public void startWorkout() {
		System.out.println("Strength Workout started");
		isCompleted = false;
	}

	@Override
	public void stopWorkout() {
		if (isCompleted) {
			System.out.println("Workout not started");
		} else {
			System.out.println("Workout completed");
			isCompleted = true;
			caloriesBurned += calculateCalories();
			sets++;
		}
	}

	abstract public double calculateCalories();

	public double getCaloriesBurned() {
		return caloriesBurned;
	}

	public void display() {
		System.out.println("Workout type: " + type);
		System.out.println("Duration: " + duration.toMinutes() + " mins");
		System.out.println("Calories burned: " + caloriesBurned);
		System.out.println("Sets completed: " + sets);
	}
}
