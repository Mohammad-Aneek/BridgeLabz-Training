package com.streams.WordCounter;

import java.io.*;
import java.util.*;

public class WordCount {
	public static void main(String[] args) throws IOException {
		Map<String, Integer> counts = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("src/com/streams/WordCounter/story.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				for (String word : line.split("\\s+")) {
					word = word.toLowerCase().replaceAll("[^a-z]", "");
					if (word.isEmpty()) {
						continue;
					}
					if (!counts.containsKey(word)) {
						counts.put(word, 0);
					}
					counts.put(word, counts.get(word) + 1);
				}
			}
		}

		Comparator<String> mostRepeated = (String s1, String s2) -> {
			int compareResult = counts.get(s2).compareTo(counts.get(s1));
			if (compareResult == 0) {
				return s1.compareTo(s2);
			} else {
				return compareResult;
			}
		};

		TreeMap<String, Integer> sortedCounts = new TreeMap<String, Integer>(mostRepeated);
		sortedCounts.putAll(counts);
//		System.out.println(sortedCounts);
		int i = 5;
		for (Map.Entry<String, Integer> entry : sortedCounts.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());

			if (--i == 0) {
				break;
			}
		}
	}
}
