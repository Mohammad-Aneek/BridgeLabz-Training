package com.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GetBinary {
	public static List<String> generateBinaryList(int n) {
		Queue<String> queue = new LinkedList<String>();
		List<String> result = new ArrayList<String>();

		queue.add("0");
		queue.add("1");
		while (n > 0) {
			String s1 = queue.poll();
			result.add(s1);
			if (!s1.equals("0")) {
				queue.add(s1 + "0");
				queue.add(s1 + "1");
			}
			n--;
		}

		return result;
	}

	public static void main(String[] args) {
		int n = 10;
		List<String> binaryList = generateBinaryList(n);
		System.out.println("First " + n + " binary numbers: " + binaryList);
	}
}
