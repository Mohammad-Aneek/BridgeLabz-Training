package com.reflection.Advanced.CustomLogger;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		RealService original = new RealService();

		Service proxy = (Service) Proxy.newProxyInstance(RealService.class.getClassLoader(),
				new Class[] { Service.class }, new LoggingHandler(original));

		proxy.serve();
	}
}
