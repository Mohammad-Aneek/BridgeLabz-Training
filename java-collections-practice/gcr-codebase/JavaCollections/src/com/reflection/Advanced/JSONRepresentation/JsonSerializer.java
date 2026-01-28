package com.reflection.Advanced.JSONRepresentation;

import java.lang.reflect.Field;

public class JsonSerializer {
	public static String toJson(Object obj) throws Exception {
		Class<?> clazz = obj.getClass();
		StringBuilder json = new StringBuilder("{");

		Field[] fields = clazz.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field f = fields[i];
			f.setAccessible(true);

			json.append("\"").append(f.getName()).append("\":");

			Object value = f.get(obj);
			if (value instanceof String) {
				json.append("\"").append(value).append("\"");
			} else {
				json.append(value);
			}

			if (i < fields.length - 1) {
				json.append(",");
			}
		}
		json.append("}");
		return json.toString();
	}
}
