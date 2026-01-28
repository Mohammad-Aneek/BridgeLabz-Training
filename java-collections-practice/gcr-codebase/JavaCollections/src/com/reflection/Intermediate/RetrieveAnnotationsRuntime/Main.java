package com.reflection.Intermediate.RetrieveAnnotationsRuntime;

public class Main {
	public static void main(String[] args) {
		Class<?> clazz = Book.class;

		if (clazz.isAnnotationPresent(Author.class)) {
			Author auth = clazz.getAnnotation(Author.class);
			System.out.println("Written by: " + auth.name());
		} else {
			System.out.println("Nothing");
		}
	}
}
