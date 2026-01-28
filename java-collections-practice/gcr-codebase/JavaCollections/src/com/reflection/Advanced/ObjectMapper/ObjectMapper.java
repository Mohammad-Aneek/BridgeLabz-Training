package com.reflection.Advanced.ObjectMapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
	public static <T> T toObject(Class<T> clazz, Map<String, Object> map) throws Exception {
		T instance = clazz.getDeclaredConstructor().newInstance();

		for (Map.Entry<String, Object> entry : map.entrySet()) {
			String fieldName = entry.getKey();
			Object value = entry.getValue();

			try {
				Field field = clazz.getDeclaredField(fieldName);
				field.setAccessible(true);
				field.set(instance, value);
			} catch (NoSuchFieldException e) {
				System.out.println("Invalid Field");
			}
		}
		return instance;
	}
}
