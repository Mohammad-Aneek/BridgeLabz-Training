package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {
	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> resultSet = new HashSet<Integer>(set1);
		resultSet.addAll(set2);
		return resultSet;
	}

	public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> resultSet = new HashSet<Integer>();

		for (Integer element : set1) {
			if (set2.contains(element)) {
				resultSet.add(element);
			}
		}

		return resultSet;
	}

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<Integer>();
		setA.add(1);
		setA.add(2);
		setA.add(3);

		Set<Integer> setB = new HashSet<Integer>();
		setB.add(3);
		setB.add(4);
		setB.add(5);

		Set<Integer> unionSet = union(setA, setB);
		Set<Integer> intersectionSet = intersection(setA, setB);

		System.out.println("Union of Set A and Set B: " + unionSet);
		System.out.println("Intersection of Set A and Set B: " + intersectionSet);
	}
}
