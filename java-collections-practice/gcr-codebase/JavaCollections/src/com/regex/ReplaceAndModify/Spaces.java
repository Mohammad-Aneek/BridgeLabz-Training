package com.regex.ReplaceAndModify;

public class Spaces {
	public static String cleanSpaces(String text) {
		return text.replaceAll("\\s+", " ");
	}

	public static void main(String[] args) {
		String text = "This   is  a    sample   text with   irregular   spacing.";
		String cleanedText = cleanSpaces(text);
		System.out.println("Original: \"" + text + "\"");
		System.out.println("Cleaned: \"" + cleanedText + "\"");

	}
}
