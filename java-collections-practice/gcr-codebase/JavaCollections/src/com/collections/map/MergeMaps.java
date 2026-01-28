package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
	public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
		Map<String, Integer> merged = new HashMap<String, Integer>(map1);

		for (Map.Entry<String, Integer> entry : map2.entrySet()) {
			if (merged.containsKey(entry.getKey())) {
				merged.put(entry.getKey(), merged.get(entry.getKey()) + entry.getValue());
			} else {
				merged.put(entry.getKey(), entry.getValue());

			}
		}

		return merged;
	}

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("A", 1);
		map1.put("B", 2);

		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("B", 3);
		map2.put("C", 4);

		Map<String, Integer> mergedMap = mergeMaps(map1, map2);

		System.out.println("Merged Map: " + mergedMap);
	}
}
