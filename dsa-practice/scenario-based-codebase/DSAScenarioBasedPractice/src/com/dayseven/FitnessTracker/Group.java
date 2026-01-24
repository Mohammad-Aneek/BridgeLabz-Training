package com.dayseven.FitnessTracker;

import java.util.ArrayList;

public class Group {
	private ArrayList<Steps> users;

	public Group() {
		this.users = new ArrayList<Steps>();
	}

	public void logSteps(String name, int steps) {
		users.add(new Steps(name, steps));
	}

	public void sort() {
		int n = users.size();

		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;

			for (int j = 0; j < n - i - 1; j++) {

				if (users.get(j).steps < users.get(j + 1).steps) {
					Steps temp = users.get(j);
					users.set(j, users.get(j + 1));
					users.set(j + 1, temp);

					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}
		}
	}

	public void display() {
		System.out.println("Leaderboard: ");
		for (Steps u : users) {
			System.out.println(u);
		}
	}
}
