package com.annotations.Intermediate.LogExecutionTime;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		DataProcessor obj = new DataProcessor();
		Method m = DataProcessor.class.getMethod("heavyComputation");

		long start = 0;
		boolean isLog = m.isAnnotationPresent(LogExecutionTime.class);

		if (isLog) {
			start = System.nanoTime();
		}

		m.invoke(obj);

		if (isLog) {
			long end = System.nanoTime();
			System.out.println("Method took: " + (end - start) / 1_000_000 + " ms");
		}
	}
}
