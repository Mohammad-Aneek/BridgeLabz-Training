package com.stringbuilder.ReverseString;

public class Reverse {
	public static String usingStringBuilder(String input) {
		if (input == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		return sb.reverse().toString();
	}
}
