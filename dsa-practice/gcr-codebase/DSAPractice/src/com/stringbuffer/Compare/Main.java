package com.stringbuffer.Compare;

public class Main {
	public static void main(String[] args) {

		long startTime = System.nanoTime();
		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < 1000000; i++) {
			sbf.append("Hello");
		}
		System.out.println("StringBuffer Time: " + (System.nanoTime() - startTime));

		startTime = System.nanoTime();
		StringBuilder sbl = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			sbl.append("Hello");
		}
		System.out.println("StringBuilder Time: " + (System.nanoTime() - startTime));
	}
}
