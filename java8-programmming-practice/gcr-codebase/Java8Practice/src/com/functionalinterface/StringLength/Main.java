package com.functionalinterface.StringLength;

import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		Function<String, Integer> lengthCalculator = (str) -> str.length();

		String message = "Hello Java 8";
		int len = lengthCalculator.apply(message);

		System.out.println("Message length: " + len);
		if (len > 10) {
			System.out.println("Warning: Message is long.");
		}
	}
}
