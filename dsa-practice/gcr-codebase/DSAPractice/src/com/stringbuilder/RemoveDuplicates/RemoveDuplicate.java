package com.stringbuilder.RemoveDuplicates;

import java.util.HashSet;

public class RemoveDuplicate {
	public static String usingStringBuilder(String input) {
		if (input == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<>();

		for (char c : input.toCharArray()) {
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
}
