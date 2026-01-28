package com.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Reverse {
	public static void reverseList(List<Integer> list) {
		int left = 0, right = list.size() - 1;

		while (left < right) {
			int temp = list.get(left);
			list.set(left, list.get(right));
			list.set(right, temp);
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);

		System.out.println("Original ArrayList: " + arrayList);
		reverseList(arrayList);
		System.out.println("Reversed ArrayList: " + arrayList);

		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);

		System.out.println("Original LinkedList: " + linkedList);
		reverseList(linkedList);
		System.out.println("Reversed LinkedList: " + linkedList);
	}
}
