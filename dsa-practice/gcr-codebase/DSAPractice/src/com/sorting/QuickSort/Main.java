package com.sorting.QuickSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] prices = { 70, 45, 90, 30, 80 };
		System.out.println("Original Prices: " + Arrays.toString(prices));
		QuickSort.sort(prices);
		System.out.println("Sorted prices:   " + Arrays.toString(prices));
	}

}
