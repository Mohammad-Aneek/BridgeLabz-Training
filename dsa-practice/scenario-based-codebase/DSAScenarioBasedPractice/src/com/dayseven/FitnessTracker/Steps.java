package com.dayseven.FitnessTracker;

public class Steps {
	String username;
	int steps;

	public Steps(String username, int steps) {
		this.username = username;
		this.steps = steps;
	}

	@Override
	public String toString() {
		return username + ": " + steps;
	}
}
