package com.annotations.Intermediate.FieldValidation;

import java.lang.reflect.Field;

public class Validator {
	public static void validate(Object obj) throws Exception {
		for (Field f : obj.getClass().getDeclaredFields()) {
			if (f.isAnnotationPresent(MaxLength.class)) {
				MaxLength rule = f.getAnnotation(MaxLength.class);
				f.setAccessible(true); // Allow reading private fields
				String value = (String) f.get(obj);

				if (value.length() > rule.value()) {
					System.out.println("Validation failed for field: " + f.getName());
					throw new IllegalArgumentException(f.getName() + " is too long!");
				} else {
					System.out.println("Field " + f.getName() + " is valid.");
				}
			}
		}
	}
}
