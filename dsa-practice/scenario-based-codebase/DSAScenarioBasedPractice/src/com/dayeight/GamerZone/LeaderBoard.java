package com.dayeight.GamerZone;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderBoard {
	private ArrayList<Player> players;

	public LeaderBoard() {
		players = new ArrayList<>();
	}

	public void addPlayer(Player player) {
		players.add(player);
	}

	public void displayLeaderBoard() {
		quickSort(0, players.size() - 1);
		System.out.println("Leader Board:");
		for (Player player : players) {
			System.out.println(player);
		}
	}

	private void quickSort(int low, int high) {
		if (low >= high) {
			return;
		}

		int pivot = low;
		int left = low + 1;
		int right = high;

		while (left <= right) {
			while (left <= right && players.get(left).compareTo(players.get(pivot)) <= 0) {
				left++;
			}

			while (left <= right && players.get(right).compareTo(players.get(pivot)) > 0) {
				right--;
			}

			if (left < right) {
				Collections.swap(players, left, right);
			}
		}

		Collections.swap(players, pivot, right);
		quickSort(low, right - 1);
		quickSort(right + 1, high);
	}
}
