package com.sorting.InsertionSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] employeeIDs = { 1045, 1022, 1099, 1010, 1035 };
		System.out.println("Original IDs: " + Arrays.toString(employeeIDs));
		InsertionSort.sort(employeeIDs);
		System.out.println("Sorted IDs:   " + Arrays.toString(employeeIDs));
	}

}
