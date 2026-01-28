package com.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToSortedList {
	public static List<Integer> setToSortedList(Set<Integer> set) {
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(2);
		set.add(8);
		set.add(1);
		set.add(4);

		List<Integer> sortedList = setToSortedList(set);
		System.out.println("Sorted List: " + sortedList);
	}
}
