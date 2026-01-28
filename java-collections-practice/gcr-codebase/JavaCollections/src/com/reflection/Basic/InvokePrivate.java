package com.reflection.Basic;

import java.lang.reflect.Method;

public class InvokePrivate {
	public static void main(String[] args) throws Exception {
		Person p = new Person();

		Class<?> clazz = p.getClass();

		Method displayMethod = clazz.getDeclaredMethod("displayInfo");
		displayMethod.setAccessible(true);

		displayMethod.invoke(p);
	}
}
