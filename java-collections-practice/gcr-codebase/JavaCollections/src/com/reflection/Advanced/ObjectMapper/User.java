package com.reflection.Advanced.ObjectMapper;

public class User {
	private String username;
	private int points;

	@Override
	public String toString() {
		return username + " has " + points + " points";
	}
}
