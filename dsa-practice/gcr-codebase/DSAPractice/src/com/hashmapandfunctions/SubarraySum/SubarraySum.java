package com.hashmapandfunctions.SubarraySum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubarraySum {
	static int[][] getSubarrayWithSum(int[] array, int targetSum) {
		ArrayList<int[]> result = new ArrayList<int[]>();
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		map.put(0, new ArrayList<Integer>());
		map.get(0).add(0);

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (map.containsKey(sum)) {
				ArrayList<Integer> indexes = map.get(sum);

				for (Integer index : indexes) {
					result.add(Arrays.copyOfRange(array, index, i + 1));
				}
			} else {
				map.put(sum, new ArrayList<Integer>());
			}

			map.get(sum).add(i);
		}

		return result.toArray(new int[result.size()][]);
	}
}
