package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MaxValueKey {
	public static String findMaxKey(Map<String, Integer> map) {
		String maxKey = null;
		int maxValue = Integer.MIN_VALUE;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				maxKey = entry.getKey();
			}
		}

		return maxKey;
	}

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 15);

		String maxKey = findMaxKey(map);
		System.out.println("Key with maximum value: " + maxKey);
	}
}
