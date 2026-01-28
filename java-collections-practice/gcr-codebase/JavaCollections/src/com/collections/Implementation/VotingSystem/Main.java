package com.collections.Implementation.VotingSystem;

public class Main {
	public static void main(String[] args) {
		VotingSystem votingSystem = new VotingSystem();

		votingSystem.castVote("Alice");
		votingSystem.castVote("Bob");
		votingSystem.castVote("Alice");
		votingSystem.castVote("Charlie");
		votingSystem.castVote("Bob");
		votingSystem.castVote("Alice");

		System.out.println("Voting Results:");
		votingSystem.displayResults();

		System.out.println();
		votingSystem.displayLeaderboard();
	}
}
