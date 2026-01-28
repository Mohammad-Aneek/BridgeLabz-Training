package com.reflection.Advanced.MethodExecutionTime;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		SlowTask task = new SlowTask();
		Method m = SlowTask.class.getMethod("process");

		long start = System.currentTimeMillis();
		m.invoke(task);
		long end = System.currentTimeMillis();

		System.out.println("Execution Time: " + (end - start) + "ms");
	}
}
