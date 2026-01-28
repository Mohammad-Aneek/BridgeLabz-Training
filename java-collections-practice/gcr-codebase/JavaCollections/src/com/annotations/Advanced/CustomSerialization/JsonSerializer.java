package com.annotations.Advanced.CustomSerialization;

import java.lang.reflect.Field;

public class JsonSerializer {
	public static String toJson(Object obj) throws Exception {
		StringBuilder json = new StringBuilder("{");
		for (Field f : obj.getClass().getDeclaredFields()) {
			f.setAccessible(true);
			String key = f.getName();

			if (f.isAnnotationPresent(JsonField.class)) {
				key = f.getAnnotation(JsonField.class).name();
			}

			json.append("\"").append(key).append("\": \"").append(f.get(obj)).append("\", ");
		}
		return json.substring(0, json.length() - 2) + "}";
	}
}
