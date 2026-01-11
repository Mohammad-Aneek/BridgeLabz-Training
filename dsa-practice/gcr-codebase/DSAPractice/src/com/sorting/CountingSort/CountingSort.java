package com.sorting.CountingSort;

public class CountingSort {
	public static void sort(int[] ages) {
		int[] count = new int[9];
		for (int age : ages) {
			count[age - 10]++;
		}
		for (int i = 1; i < 9; i++) {
			count[i] += count[i - 1];
		}

		int[] temp = ages.clone();
		for (int i = 0; i < temp.length; i++) {
			int num = temp[i];
			ages[count[num - 10] - 1] = temp[i];
			count[num - 10]--;
		}
	}
}
