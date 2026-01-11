package com.hashmapandfunctions.SubarraySum;


public class Main {
	public static void main(String[] args) {
		int[] arr = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };

		int[][] result = SubarraySum.getSubarrayWithSum(arr, 0);

		for (int[] array : result) {
			System.out.print("[ ");
			for (int element : array) {
				System.out.print(element + " ");
			}
			System.out.println(" ]");
		}
	}
}
