package com.annotations.Beginner.Marker;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		Method[] methods = ReportSystem.class.getDeclaredMethods();

		for (Method method : methods) {
			if (method.isAnnotationPresent(ImportantMethod.class)) {
				System.out.println("Important Method: " + method.getName());
			}
		}
	}
}
