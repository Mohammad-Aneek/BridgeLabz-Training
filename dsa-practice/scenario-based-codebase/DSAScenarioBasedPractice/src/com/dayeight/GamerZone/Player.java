package com.dayeight.GamerZone;

public class Player implements Comparable<Player> {
	String name;
	int score;

	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Player o) {
		return o.score - this.score;
	}

	@Override
	public String toString() {
		return name + " [" + score + "]";
	}
}
