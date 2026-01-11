package com.stackandqueue.SlidingWindowMaximum;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMax {
	public int[] getMaxInWindow(int[] array, int k) {
		if (array == null || k <= 0 || k > array.length) {
			return null;
		}
		int[] result = new int[array.length - k + 1];

		Deque<Integer> windowQueue = new ArrayDeque<Integer>();

		for (int i = 0; i < result.length; i++) {
			while (!windowQueue.isEmpty() && windowQueue.peekFirst() < i - k + 1) {
				windowQueue.pollFirst();
			}

			while (!windowQueue.isEmpty() && array[windowQueue.peekLast()] < array[i]) {
				windowQueue.pollLast();
			}

			windowQueue.offerLast(i);

			if (i >= k - 1) {
				result[i - k + 1] = array[windowQueue.peekFirst()];
			}
		}

		return result;
	}
}
