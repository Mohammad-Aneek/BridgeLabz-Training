package com.hashmapandfunctions.LongestConsecutive;

public class Main {

	public static void main(String[] args) {
		LongestConsecutiveSequence solver = new LongestConsecutiveSequence();
		int[] nums = { 100, 4, 200, 1, 3, 2 };

		System.out.println("Longest consecutive sequence length: " + solver.getSequenceLength(nums));
	}

}
