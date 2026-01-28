package com.collections.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountWords {
	public static Map<String, Integer> countWords(String input) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		String[] words = input.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
		for (String w : words) {
			if (map.containsKey(w)) {
				map.put(w, map.get(w) + 1);
			} else {
				map.put(w, 1);
			}
		}

		return map;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("src/com/collections/map/Input.txt"));

		StringBuilder input = new StringBuilder();
		String line;

		while ((line = reader.readLine()) != null) {
			input.append(line).append(" ");
		}

		Map<String, Integer> wordCount = countWords(input.toString());

		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		reader.close();
	}
}
