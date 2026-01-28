package com.regex.Advanced;

import java.util.Scanner;

public class CreditCard {
	public static void checkCreditCard(String card) {
		card = card.replaceAll("\\s+", "");

		if (card.matches("^4\\d{15}$")) {
			System.out.println("Valid Visa Card");
		} else if (card.matches("^5\\d{15}$")) {
			System.out.println("Valid MasterCard");
		} else {
			System.out.println("Invalid or Unknown Card Type");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a credit card number: ");
		String input = scanner.nextLine();
		checkCreditCard(input);
	}
}
