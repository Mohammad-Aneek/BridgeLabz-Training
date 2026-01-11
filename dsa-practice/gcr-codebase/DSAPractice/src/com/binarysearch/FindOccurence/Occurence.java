package com.binarysearch.FindOccurence;

public class Occurence {
	public static int findFirst(int[] arr, int target) {
		if (arr == null || arr.length ==0) {
			return -1;
		}
		int left = 0, right = arr.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				right = mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		if (arr[right] == target) {
			return right;
		} else {
			return -1;
		}
	}

	public static int findLast(int[] arr, int target) {
		if (arr == null || arr.length ==0) {
			return -1;
		}
		int left = 0, right = arr.length - 1;

		while (left < right) {
			int mid = left + (right - left + 1) / 2;
			
			if (arr[mid] <= target) {
				left = mid;
			} else {
				right = mid - 1;
			}
		}

		if (arr[left] == target) {
			return left;
		} else {
			return -1;
		}
	}
}
