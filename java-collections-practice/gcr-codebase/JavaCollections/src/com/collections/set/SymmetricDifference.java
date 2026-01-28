package com.collections.set;

import java.util.Set;

public class SymmetricDifference {
	public static Set<Integer> getSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> union = UnionIntersection.union(set1, set2);
		Set<Integer> intersection = UnionIntersection.intersection(set1, set2);

		union.removeAll(intersection);
		return union;
	}
}
