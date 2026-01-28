package com.regex.ReplaceAndModify;

public class Censor {
	public static String censor(String text, String[] badWords) {
		for (String word : badWords) {
			text = text.replaceAll("(?i)" + word, "****");
		}
		return text;
	}

	public static void main(String[] args) {
		String text = "This is a badword1 and another BadWord2 in the text.";
		String[] badWords = { "badword1", "badword2" };
		String censoredText = censor(text, badWords);
		System.out.println("Original: " + text);
		System.out.println("Censored: " + censoredText);
	}
}
