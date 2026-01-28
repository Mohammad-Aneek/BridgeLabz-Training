package com.collections.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Rotate {
	public static void rotate(List<Integer> list, int k) {
		int n = list.size();
		k = k % n;
		List<Integer> sub = new ArrayList<>(list.subList(n - k, n));
		list.removeAll(sub);
		list.addAll(0, sub);
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		System.out.println("Original ArrayList: " + arrayList);
		rotate(arrayList, 2);
		System.out.println("Rotated ArrayList by 2: " + arrayList);

		Collections.rotate(arrayList, 2);
		System.out.println("Rotated ArrayList by 2 using Collections.rotate: " + arrayList);
	}
}
