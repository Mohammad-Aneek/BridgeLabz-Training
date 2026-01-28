package com.regex.Extraction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Links {
	public static void extractLinks(String text) {
		String regex = "https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
		Matcher m = Pattern.compile(regex).matcher(text);
		while (m.find()) {
			System.out.println("Links: " + m.group());
		}
	}

	public static void main(String[] args) {
		String text = "Visit https://www.google.com and http://example.org for more info.";
		extractLinks(text);
	}
}
