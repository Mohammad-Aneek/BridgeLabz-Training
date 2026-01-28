package com.exceptions.CustomException;

public class Main {
	static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		} else {
			System.out.println("Access granted!");
		}
	}

	public static void main(String[] args) {
		try {
			validateAge(15);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
