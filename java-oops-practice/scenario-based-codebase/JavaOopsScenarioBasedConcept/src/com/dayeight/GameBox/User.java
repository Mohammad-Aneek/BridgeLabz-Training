package com.dayeight.GameBox;

import java.util.ArrayList;

public class User {
	private String username;
	private ArrayList<Game> ownedGames;

	public User(String username) {
		this.username = username;
		this.ownedGames = new ArrayList<>();
	}

	public void buyGame(Game game) {
		ownedGames.add(game);
		game.download();
	}

	public void showLibrary() {
		System.out.println("Game Library: ");
		if (ownedGames.isEmpty()) {
			System.out.println("No games owned.");
		} else {
			for (Game g : ownedGames) {
				System.out.println("- " + g.getTitle() + " (" + g.genre + ")");
			}
		}
	}
}
