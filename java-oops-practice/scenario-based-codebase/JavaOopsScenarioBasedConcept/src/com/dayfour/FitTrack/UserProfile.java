package com.dayfour.FitTrack;

import java.util.ArrayList;
import java.util.List;

public class UserProfile {
	private String name;
	private int age;
	private double weight;
	private double goal;
	private double progress;
	private List<Workout> workoutHistory;

	public UserProfile(String name, int age, double weight) {
		this(name, age, weight, 500);
	}

	UserProfile(String name, int age, double weight, double goal) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.goal = goal;
		this.progress = 0;
		this.workoutHistory = new ArrayList<Workout>();
	}

	public void doWorkout(Workout workout) {
		if (!workoutHistory.contains(workout)) {
			workoutHistory.add(workout);
		}

		workout.startWorkout();
		workout.stopWorkout();

		goal += workout.calculateCalories();

		System.out.println("Workout completed");
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Goal: " + goal);
		System.out.println("Progress: " + progress);
		if (progress >= goal) {
			System.out.println("Status: Goal reached");
		} else {
			System.out.println("Status: " + (goal - progress) + " left");
		}

		for (Workout workout : workoutHistory) {
			workout.display();
		}
	}
}
