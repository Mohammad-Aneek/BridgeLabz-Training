package com.sorting.SelectionSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] scores = { 70, 45, 90, 30, 80 };
		System.out.println("Original Scores: " + Arrays.toString(scores));
		SelectionSort.sort(scores);
		System.out.println("Sorted Scores:   " + Arrays.toString(scores));
	}

}
