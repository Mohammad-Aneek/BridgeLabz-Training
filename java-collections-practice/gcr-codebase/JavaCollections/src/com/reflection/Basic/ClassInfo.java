package com.reflection.Basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInfo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter full class name (e.g., java.util.ArrayList): ");
		String className = scanner.nextLine();

		try {
			Class<?> clazz = Class.forName(className);

			System.out.println("Fields:");
			Field[] fields = clazz.getDeclaredFields();
			for (Field f : fields) {
				System.out.println(f.getType().getSimpleName() + " " + f.getName());
			}

			System.out.println("Constructors:");
			Constructor<?>[] constructors = clazz.getDeclaredConstructors();
			for (Constructor<?> c : constructors) {
				System.out.println(c.getName() + " with params: " + c.getParameterCount());
			}

			System.out.println("Methods:");
			Method[] methods = clazz.getDeclaredMethods();
			for (Method m : methods) {
				System.out.println(m.getReturnType().getSimpleName() + " " + m.getName() + "()");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found! Make sure to use the full package name.");
		}
	}
}
