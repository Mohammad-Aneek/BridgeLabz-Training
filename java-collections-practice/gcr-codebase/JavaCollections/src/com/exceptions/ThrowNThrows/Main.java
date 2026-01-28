package com.exceptions.ThrowNThrows;

public class Main {
	static double calculateInterest(double a, double r, int y) throws IllegalArgumentException {
		if (a < 0 || r < 0) {
			throw new IllegalArgumentException("Negative input");
		}
		return (a * r * y) / 100;
	}

	public static void main(String[] args) {
		try {
			calculateInterest(-100, 5, 2);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input: Amount and rate must be positive");
		}
	}
}
