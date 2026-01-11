package com.hashmapandfunctions.TwoSum;

import java.util.HashMap;

public class TwoSum {
	public int[] getPair(int[] arr, int targetSum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(targetSum - arr[i])) {
				return new int[] { map.get(targetSum - arr[i]), i };
			} else {
				map.put(arr[i], i);
			}
		}

		return new int[] {};
	}
}
