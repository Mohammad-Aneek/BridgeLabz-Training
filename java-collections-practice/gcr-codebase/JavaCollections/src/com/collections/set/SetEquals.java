package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetEquals {
	public static boolean check(Set<Integer> set1, Set<Integer> set2) {
		if (set1.size() != set2.size()) {
			return false;
		}

		for (Integer element : set1) {
			if (!set2.contains(element)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<Integer>();
		setA.add(1);
		setA.add(2);
		setA.add(3);

		Set<Integer> setB = new HashSet<Integer>();
		setB.add(3);
		setB.add(2);
		setB.add(1);

		Set<Integer> setC = new HashSet<Integer>();
		setC.add(4);
		setC.add(5);
		setC.add(6);

		System.out.println("Set A equals Set B: " + check(setA, setB));
		System.out.println("Set A equals Set C: " + check(setA, setC));
	}
}
