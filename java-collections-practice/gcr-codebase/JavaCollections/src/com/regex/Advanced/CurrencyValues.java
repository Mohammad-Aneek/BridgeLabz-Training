package com.regex.Advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyValues {
	public static void extractCurrency(String text) {
		Matcher m = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);
		while (m.find()) {
			System.out.println("Value: " + m.group());
		}
	}

	public static void main(String[] args) {
		String sample = "The price is $45.99, and the discount is 10.50.";
		extractCurrency(sample);
	}
}
