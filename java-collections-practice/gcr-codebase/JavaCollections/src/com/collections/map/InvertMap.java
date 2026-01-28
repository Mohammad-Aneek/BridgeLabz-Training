package com.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
	public static <K, V> Map<V, List<K>> invertMap(Map<K, V> source) {
		Map<V, List<K>> inverted = new HashMap<V, List<K>>();

		for (Map.Entry<K, V> entry : source.entrySet()) {
			V value = entry.getValue();
			K key = entry.getKey();

			if (!inverted.containsKey(value)) {
				inverted.put(value, new ArrayList<K>());
			}

			inverted.get(value).add(key);
		}

		return inverted;
	}

	public static void main(String[] args) {
		Map<String, Integer> input = new HashMap<>();
		input.put("A", 1);
		input.put("B", 2);
		input.put("C", 1);

		Map<Integer, List<String>> output = invertMap(input);

		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}
}
