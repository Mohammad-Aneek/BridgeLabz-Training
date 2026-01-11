package com.binarysearch.FindOccurence;

public class Main {
	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10, 10 };
		int target = 8;
		System.out.println(Occurence.findFirst(nums, target));
		System.out.println(Occurence.findLast(nums, target));

	}
}
