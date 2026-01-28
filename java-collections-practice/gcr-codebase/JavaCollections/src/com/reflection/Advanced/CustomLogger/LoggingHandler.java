package com.reflection.Advanced.CustomLogger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingHandler implements InvocationHandler {
	private final Object target;

	public LoggingHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Logging: Invoking " + method.getName());
		Object result = method.invoke(target, args);
		System.out.println("Logging: Finished " + method.getName());
		return result;
	}
}
