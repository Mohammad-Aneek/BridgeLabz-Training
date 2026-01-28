package com.exceptions.Finally;

public class Main {
	public static void main(String[] args) {
		try {
			int res = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Math Error!");
		} finally {
			System.out.println("Operation completed");
		}

		System.out.println("Continuing with the rest of the program...");
	}
}
