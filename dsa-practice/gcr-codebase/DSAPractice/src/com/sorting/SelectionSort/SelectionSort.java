package com.sorting.SelectionSort;

public class SelectionSort {
	public static void sort(int[] scores) {
		int n = scores.length;

		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++)
				if (scores[j] < scores[min]) {
					min = j;
				}

			int temp = scores[min];
			scores[min] = scores[i];
			scores[i] = temp;
		}
	}
}
