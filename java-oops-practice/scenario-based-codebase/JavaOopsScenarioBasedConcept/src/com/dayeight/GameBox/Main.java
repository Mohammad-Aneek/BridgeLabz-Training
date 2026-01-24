package com.dayeight.GameBox;

public class Main {

	public static void main(String[] args) {
		Game game1 = new ArcadeGame("Space Runner", 9.99, 4.5);
		Game game2 = new StrategyGame("Civilization Builder", 49.99, 4.8);

		game1.playDemo();
		game2.playDemo();

		game2.applySeasonalOffer(20);

		User player1 = new User("GamerOne");

		player1.buyGame(game1);
		player1.buyGame(game2);

		player1.showLibrary();
	}

}
