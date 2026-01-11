package com.binarysearch.RotatedSorted;

public class RotatedSorted {
	public static int findSmallest(int[] arr) {
		int left = 0, right = arr.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] > arr[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}
}
