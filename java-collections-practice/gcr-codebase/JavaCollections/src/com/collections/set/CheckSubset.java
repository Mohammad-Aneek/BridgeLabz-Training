package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class CheckSubset {
	public static boolean isSubset(Set<Integer> set, Set<Integer> subset) {
		for (Integer element : subset) {
			if (!set.contains(element)) {
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
		setB.add(2);
		setB.add(3);

		System.out.println("Set B subset of Set A: " + isSubset(setA, setB));
		System.out.println("Set A subset of Set B: " + isSubset(setB, setA));
	}
}
