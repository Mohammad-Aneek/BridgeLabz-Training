package com.dayfour.FitTrack;

import java.time.Duration;

public class CardioWorkout extends Workout {

	public CardioWorkout(Duration duration) {
		super("Cardio Workout", duration);
		this.isCompleted = false;
	}

	@Override
	public double calculateCalories() {
		if (isCompleted) {
			return 10 + duration.toMinutes() * 8;
		} else {
			return 0;
		}
	}

}
