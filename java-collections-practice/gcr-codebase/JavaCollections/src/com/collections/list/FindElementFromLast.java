package com.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class FindElementFromLast {
	public static String findNthFromEnd(LinkedList<String> list, int n) {
		Iterator<String> fast = list.iterator();
		Iterator<String> slow = list.iterator();
		int i = 0;
		while (i < n) {
			if (fast.hasNext()) {
				fast.next();
				i++;
			} else {
				return null;
			}
		}

		String res = null;

		while (fast.hasNext()) {
			fast.next();
			res = slow.next();
		}

		return res;
	}

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		linkedList.add("E");

		int n = 2;
		String result = findNthFromEnd(linkedList, n);

		if (result != null) {
			System.out.println(n + "th element from the end is: " + result);
		} else {
			System.out.println("Not enough elements in the list.");
		}
	}
}
