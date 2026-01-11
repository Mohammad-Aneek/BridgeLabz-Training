package com.hashmapandfunctions.TwoSum;

public class Main {

	public static void main(String[] args) {
		TwoSum solver = new TwoSum();
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] pair = solver.getPair(nums, target);

		if (pair.length == 2) {
			System.out.println("The pair is " + pair[0] + " and " + pair[1]);
		}
	}

}
