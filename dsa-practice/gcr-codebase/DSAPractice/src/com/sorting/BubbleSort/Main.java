package com.sorting.BubbleSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] marks = {85, 92, 78, 65, 99, 88};
        System.out.println("Original Marks: " + Arrays.toString(marks));
        BubbleSort.sort(marks);
        System.out.println("Sorted Marks:   " + Arrays.toString(marks));
    }

}
