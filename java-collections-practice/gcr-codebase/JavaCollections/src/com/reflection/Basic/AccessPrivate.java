package com.reflection.Basic;

import java.lang.reflect.Field;

public class AccessPrivate {

	public static void main(String[] args) throws Exception {
		Person p = new Person();

		Class<?> clazz = p.getClass();

		Field ageField = clazz.getDeclaredField("age");
		ageField.setAccessible(true);
		System.out.println("Age before modification: " + ageField.getInt(p));
		ageField.setInt(p, 30);
		System.out.println("Age after modification: " + ageField.getInt(p));
	}
}
