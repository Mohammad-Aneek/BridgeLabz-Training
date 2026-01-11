package com.stackandqueue.SlidingWindowMaximum;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		SlidingWindowMax solver = new SlidingWindowMax();
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int[] result = solver.getMaxInWindow(nums, k);

		System.out.println("Array: " + Arrays.toString(nums));
		System.out.println("Max of each window: " + Arrays.toString(result));

	}

}
