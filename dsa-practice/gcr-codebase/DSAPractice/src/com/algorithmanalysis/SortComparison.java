package com.algorithmanalysis;

import java.util.Random;

import com.sorting.BubbleSort.BubbleSort;
import com.sorting.MergeSort.MergeSort;
import com.sorting.QuickSort.QuickSort;

public class SortComparison {
	public static void main(String[] args) {
		int[] sizes = { 1000, 10000, 1000000 };

		for (int size : sizes) {
			int[] original = new Random().ints(size).toArray();

			int[] arr1 = original.clone();
			int[] arr2 = original.clone();
			int[] arr3 = original.clone();

			int target = size - 1;
			
			long start = System.nanoTime();
			QuickSort.sort(arr1);
			long end = System.nanoTime();
			System.out.println("Quick sort: " + (end - start));
			
			start = System.nanoTime();
			MergeSort.sort(arr2);
			end = System.nanoTime();
			System.out.println("Merge sort: " + (end - start));

			start = System.nanoTime();
			BubbleSort.sort(arr3);
			end = System.nanoTime();
			System.out.println("Bubble sort: " + (end - start));
			
			System.out.println();
		}
	}
}
