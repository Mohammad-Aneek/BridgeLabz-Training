package com.regex.Extraction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dates {

	public static void extractDates(String text) {
		String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
		Matcher m = Pattern.compile(regex).matcher(text);
		while (m.find()) {
			System.out.println("Dates: " + m.group());
		}
	}

	public static void main(String[] args) {
		String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
		extractDates(text);
	}
}
