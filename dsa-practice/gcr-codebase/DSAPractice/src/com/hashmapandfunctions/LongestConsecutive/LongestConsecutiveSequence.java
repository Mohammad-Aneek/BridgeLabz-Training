package com.hashmapandfunctions.LongestConsecutive;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public int getSequenceLength(int[] array) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int num : array) {
			set.add(num);
		}

		int maxSequence = 0;

		for (int num : array) {
			if (!set.contains(num - 1)) {
				int count = 1;
				int temp = num + 1;

				while (set.contains(temp)) {
					count++;
				}
				maxSequence = Math.max(maxSequence, count);
			}
		}
		
		return maxSequence;
	}
}
