package com.sorting.QuickSort;

public class QuickSort {
	public static void sort(int[] prices) {
		sort(prices, 0, prices.length - 1);
	}

	private static void sort(int[] prices, int start, int end) {
		if (start >= end) {
			return;
		}
		int pivot = start;
		int left = start + 1;
		int right = end;

		while (left <= right) {
			while (left <= right && prices[left] < prices[pivot]) {
				left++;
			}
			while ( left <= right && prices[right] >= prices[pivot]) {
				right--;
			}
			if (left <= right) {
				int temp = prices[left];
				prices[left] = prices[right];
				prices[right] = temp;
			}
		}

		int temp = prices[right];
		prices[right] = prices[pivot];
		prices[pivot] = temp;

		sort(prices, start, right - 1);
		sort(prices, right + 1, end);
	}
}
