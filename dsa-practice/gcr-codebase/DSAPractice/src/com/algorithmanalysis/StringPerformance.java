package com.algorithmanalysis;

public class StringPerformance {
	public static void main(String[] args) {
		int[] sizes = { 1000, 10000, 1000000 };

		for (int size : sizes) {

			long start = System.nanoTime();
			StringBuilder sbd = new StringBuilder();
			for (int i = 0; i < size; i++) {
				sbd.append("b");
			}
			long end = System.nanoTime();
			System.out.println("String: " + (end - start));

			start = System.nanoTime();
			StringBuffer sbf = new StringBuffer();
			for (int i = 0; i < size; i++) {
				sbf.append("c");
			}
			end = System.nanoTime();
			System.out.println("StringBuilder: " + (end - start));

			start = System.nanoTime();
			String s = "";
			for (int i = 0; i < size; i++) {
				s += 'a';
			}
			end = System.nanoTime();
			System.out.println("StringBuilder: " + (end - start));

			System.out.println();
		}
	}
}
