package com.reflection.Basic;

import java.lang.reflect.Constructor;

public class CreateObjects {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Person.class;

//		Person p = (Person) clazz.newInstance();
		Constructor<?> constructor = clazz.getDeclaredConstructor();
		Person p = (Person) constructor.newInstance();
	}
}
