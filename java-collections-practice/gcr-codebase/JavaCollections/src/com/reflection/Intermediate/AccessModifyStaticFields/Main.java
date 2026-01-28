package com.reflection.Intermediate.AccessModifyStaticFields;

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) throws Exception {
		Configuration.printKey();

		Field field = Configuration.class.getDeclaredField("API_KEY");
		field.setAccessible(true);
		field.set(null, "999999-UPDATED");

		Configuration.printKey();
	}
}
