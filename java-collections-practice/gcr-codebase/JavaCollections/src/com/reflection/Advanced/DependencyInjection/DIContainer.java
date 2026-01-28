package com.reflection.Advanced.DependencyInjection;

import java.lang.reflect.Field;

public class DIContainer {
	public static void injectDependencies(Object target) throws Exception {
		Class<?> clazz = target.getClass();

		for (Field field : clazz.getDeclaredFields()) {
			if (field.isAnnotationPresent(Inject.class)) {
				field.setAccessible(true);
				Object dependency = field.getType().getDeclaredConstructor().newInstance();
				field.set(target, dependency);
			}
		}
	}
}
