package com.collections.Implementation.VotingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {
	private Map<String, Integer> voteCounts;

	public VotingSystem() {
		this.voteCounts = new HashMap<String, Integer>();

	}

	public void castVote(String candidate) {
		if (!voteCounts.containsKey(candidate)) {
			voteCounts.put(candidate, 1);
		} else {
			voteCounts.put(candidate, voteCounts.getOrDefault(candidate, 0) + 1);
		}
	}

	public void displayResults() {
		TreeMap<String, Integer> sortedResults = new TreeMap<>(voteCounts);
		for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
		}
	}

	public void displayLeaderboard() {
		List<Map.Entry<String, Integer>> list = new ArrayList<>(voteCounts.entrySet());
		list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

		System.out.println("--- Leaderboard (Ranked) ---");
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " is in the lead with " + entry.getValue() + " votes!");
			break;
		}
	}
}
