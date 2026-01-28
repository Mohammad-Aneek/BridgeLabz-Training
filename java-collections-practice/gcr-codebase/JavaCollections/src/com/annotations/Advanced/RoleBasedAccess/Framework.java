package com.annotations.Advanced.RoleBasedAccess;

import java.lang.reflect.Method;

public class Framework {
	public static void invoke(Object obj, String methodName, String currentUserRole) throws Exception {
		Method m = obj.getClass().getMethod(methodName);

		if (m.isAnnotationPresent(RoleAllowed.class)) {
			String requiredRole = m.getAnnotation(RoleAllowed.class).value();
			if (!requiredRole.equals(currentUserRole)) {
				System.out.println("Access Denied!");
				return;
			}
		}
		m.invoke(obj);
	}
}
