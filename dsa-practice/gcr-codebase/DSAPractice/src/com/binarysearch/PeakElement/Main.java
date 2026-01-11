package com.binarysearch.PeakElement;

public class Main {
public static void main(String[] args) {
	int[] nums = {1, 2, 3, 1};
	int peakIndex = PeakElement.getIndex(nums);
    System.out.println("Peak Element: " + nums[peakIndex]);
}
}
