package com.sorting.MergeSort;

public class MergeSort {
	public static void sort(int[] prices) {
		sort(prices, 0, prices.length - 1);
	}

	private static void sort(int[] prices, int start, int end) {
		if (start >= end) {
			return;
		}

		int mid = start + (end - start) / 2;

		sort(prices, start, mid);
		sort(prices, mid + 1, end);

		merge(prices, start, mid, end);

	}

	private static void merge(int[] prices, int start, int mid, int end) {
		int size = end - start + 1;

		int[] array = new int[size];
		int left = start, right = mid + 1;
		for (int i = 0; i < array.length; i++) {
			if (left > mid) {
				array[i] = prices[right++];
			} else if (right > end) {
				array[i] = prices[left++];
			} else if (prices[left] <= prices[right]) {
				array[i] = prices[left++];
			} else {
				array[i] = prices[right++];
			}
		}

		for (int i = 0; i < array.length; i++) {
			prices[start + i] = array[i];
		}

	}
}
