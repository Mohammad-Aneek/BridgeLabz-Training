package com.sorting.CountingSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] ages = { 18, 10, 11, 10, 15, 12, 18, 14 };
		System.out.println("Original array: " + Arrays.toString(ages));
		CountingSort.sort(ages);
		System.out.println("Sorted array:   " + Arrays.toString(ages));
	}

}
