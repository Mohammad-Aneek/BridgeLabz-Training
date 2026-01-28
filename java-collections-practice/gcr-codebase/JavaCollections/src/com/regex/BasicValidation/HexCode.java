package com.regex.BasicValidation;

import java.util.Scanner;

public class HexCode {
	public static boolean isValidHex(String color) {
		return color.matches("^#([A-Fa-f0-9]{6})$");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a hex color code (e.g., #A1B2C3): ");
		String input = scanner.nextLine();
		if (isValidHex(input)) {
			System.out.println(input + " is a valid hex color code.");
		} else {
			System.out.println(input + " is not a valid hex color code.");
		}
		scanner.close();
	}
}
