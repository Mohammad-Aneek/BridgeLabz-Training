package com.dayfour.FitTrack;

import java.time.Duration;

public class StrengthWorkout extends Workout {

	public StrengthWorkout(Duration duration) {
		super("Strength Workout", duration);
		this.isCompleted = false;
	}

	@Override
	public double calculateCalories() {
		if (isCompleted) {
			return 5 + duration.toMinutes() * 5;
		} else {
			return 0;
		}
	}

}
