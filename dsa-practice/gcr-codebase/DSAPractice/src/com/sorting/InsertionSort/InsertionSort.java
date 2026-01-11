package com.sorting.InsertionSort;

public class InsertionSort {
	static void sort(int[] ids) {
		int n = ids.length;
		
		for (int i = 1; i < n; ++i) {
			int key = ids[i];
			int j = i - 1;

			while (j >= 0 && ids[j] > key) {
				ids[j + 1] = ids[j];
				j = j - 1;
			}
			
			ids[j + 1] = key;
		}
	}
}
