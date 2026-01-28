package com.collections.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
	public static List<Integer> removeDuplicates(List<Integer> list) {
		ArrayList<Integer> resultList = new ArrayList<>();
		HashSet<Integer> seen = new HashSet<>();

		for (Integer num : list) {
			if (!seen.contains(num)) {
				resultList.add(num);
				seen.add(num);
			}
		}

		return resultList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(2);
		arrayList.add(5);

		System.out.println("Original ArrayList: " + arrayList);
		List<Integer> noDuplicates = removeDuplicates(arrayList);
		System.out.println("ArrayList after removing duplicates: " + noDuplicates);
	}
}
