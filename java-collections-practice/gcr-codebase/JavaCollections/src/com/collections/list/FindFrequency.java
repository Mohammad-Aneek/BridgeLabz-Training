package com.collections.list;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequency {
	public static Map<String, Integer> getFrequency(List<String> list) {
		Map<String, Integer> counts = new HashMap<String, Integer>();
		for (String s : list) {
			if (counts.containsKey(s)) {
				counts.put(s, counts.get(s) + 1);
			} else {
				counts.put(s, 1);
			}
		}

		return counts;
	}

	public static void main(String[] args) {
		List<String> stringList = List.of("apple", "banana", "apple", "orange");

		Map<String, Integer> frequencyMap = getFrequency(stringList);

		System.out.println("List of elements: " + stringList);
		System.out.println("Frequency of elements: " + frequencyMap);
	}
}
