package com.regex.Advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguage {
	public static void extractLanguages(String text) {
		String regex = "\\b(Java|Python|JavaScript|Go|Rust)\\b";
		Matcher m = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(text);
		while (m.find()) {
			System.out.println("Language: " + m.group());
		}
	}

	public static void main(String[] args) {
		String sample = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
		extractLanguages(sample);
	}
}
