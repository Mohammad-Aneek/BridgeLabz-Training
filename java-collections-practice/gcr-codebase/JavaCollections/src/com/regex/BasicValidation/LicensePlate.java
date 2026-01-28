package com.regex.BasicValidation;

import java.util.Scanner;

public class LicensePlate {
	public static boolean isValidPlate(String plate) {
		return plate.matches("\\^[A-Z]{2}[ -]?[0-9]{2}[ -]?[A-Z]{1,2}[ -]?[0-9]{4}$");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a license plate to validate: ");
		String plate = scanner.nextLine();
		if (isValidPlate(plate)) {
			System.out.println("Valid license plate.");
		} else {
			System.out.println("Invalid license plate.");
		}
		scanner.close();
	}
}
