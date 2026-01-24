package com.dayeight.GamerZone;

public class Main {
	public static void main(String[] args) {
		LeaderBoard leaderBoard = new LeaderBoard();

		leaderBoard.addPlayer(new Player("Alice", 1500));
		leaderBoard.addPlayer(new Player("Bob", 3000));
		leaderBoard.addPlayer(new Player("Charlie", 2500));
		leaderBoard.addPlayer(new Player("Diana", 3500));

		leaderBoard.displayLeaderBoard();
	}
}
