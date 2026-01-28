package com.junit.main.Advanced.UserRegistration;

public class UserRegistration {
	public boolean registerUser(String username, String email, String password) {
		if (username == null || !email.contains("@") || password.length() < 6) {
			throw new IllegalArgumentException("Invalid user details");
		}
		return true;
	}
}
