package com.binarysearch.RotatedSorted;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int smallestIndex = RotatedSorted.findSmallest(arr);
		System.out.println("Smallest value: " + arr[smallestIndex]);
	}
}