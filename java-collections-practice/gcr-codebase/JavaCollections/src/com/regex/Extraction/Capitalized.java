package com.regex.Extraction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Capitalized {
	public static void extractCapitalWords(String text) {
		Matcher m = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);
		while (m.find()) {
			System.out.println("Capitalized: " + m.group());
		}
	}

	public static void main(String[] args) {
		String sample = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
		extractCapitalWords(sample);
	}
}
