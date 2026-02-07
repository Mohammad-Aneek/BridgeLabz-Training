package com.stream.InsuranceClaim;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Claim> claims = Arrays.asList(new Claim("C1", "Auto", 1000.0),
				new Claim("C2", "Health", 500.0),
				new Claim("C3", "Auto", 2000.0),
				new Claim("C4", "Home", 5000.0),
				new Claim("C5", "Health", 700.0));

		claims.stream()
				.collect(Collectors.groupingBy(c -> c.type,
						Collectors.averagingDouble(c -> c.amount)))
				.forEach(
						(value, key) -> System.out.println(value + "->" + key));
	}
}
