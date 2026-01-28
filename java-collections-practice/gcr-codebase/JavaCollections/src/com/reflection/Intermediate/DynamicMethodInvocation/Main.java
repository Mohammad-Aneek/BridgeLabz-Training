package com.reflection.Intermediate.DynamicMethodInvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Math math = Math.class.getDeclaredConstructor().newInstance();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter method to perform (add/subtract): ");
		String methodName = input.next();

		Method m = Math.class.getDeclaredMethod(methodName, int.class, int.class);
		System.out.println("Enter the two values: ");
		m.invoke(math, input.nextInt(), input.nextInt());
	}
}
