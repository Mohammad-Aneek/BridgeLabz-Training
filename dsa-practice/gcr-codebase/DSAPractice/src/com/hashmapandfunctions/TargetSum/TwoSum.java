package com.hashmapandfunctions.TargetSum;

import java.util.HashSet;

public class TwoSum {
	public boolean check(int[] arr, int targetSum) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int num : arr) {
			if (set.contains(targetSum - num)) {
				return true;
			} else {
				set.add(num);
			}
		}

		return false;
	}
}

