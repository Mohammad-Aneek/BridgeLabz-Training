package com.dayseven.FitnessTracker;

public class Main {
	public static void main(String[] args) {
		Group group = new Group();

		group.logSteps("John", 5000);
		group.logSteps("Alice", 12000);
		group.logSteps("Bob", 8000);
		group.logSteps("Eve", 15000);

		group.sort();
		group.display();
	}
}
