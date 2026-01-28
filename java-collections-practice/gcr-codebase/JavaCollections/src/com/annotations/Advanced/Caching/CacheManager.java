package com.annotations.Advanced.Caching;

import java.lang.reflect.Method;
import java.util.HashMap;

public class CacheManager {
	private static HashMap<String, Integer> cache = new HashMap<>();

	public static Integer run(Object obj, String methodName, int arg) throws Exception {
		String cacheKey = methodName + ":" + arg;
		Method m = obj.getClass().getMethod(methodName, int.class);

		if (m.isAnnotationPresent(CacheResult.class) && cache.containsKey(cacheKey)) {
			System.out.println("Returning from cache...");
			return cache.get(cacheKey);
		}

		Integer result = (Integer) m.invoke(obj, arg);

		if (m.isAnnotationPresent(CacheResult.class)) {
			cache.put(cacheKey, result);
		}

		return result;
	}
}
