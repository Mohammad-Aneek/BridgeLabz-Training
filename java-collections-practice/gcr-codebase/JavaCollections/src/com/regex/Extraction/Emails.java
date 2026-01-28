package com.regex.Extraction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emails {
	public static void extractEmails(String text) {
		String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
		Matcher m = Pattern.compile(regex).matcher(text);
		while (m.find()) {
			System.out.println("Email: " + m.group());
		}
	}

	public static void main(String[] args) {
		String sampleText = "Contact us at support@example.com and info@company.org";
		extractEmails(sampleText);

	}
}
