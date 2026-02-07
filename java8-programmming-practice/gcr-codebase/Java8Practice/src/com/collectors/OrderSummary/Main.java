package com.collectors.OrderSummary;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
	List<Order> orders = Arrays.asList(new Order("Alice", 250.0), new Order("Bob", 150.0),
		new Order("Alice", 300.0), new Order("Bob", 200.0), new Order("Charlie", 400.0));

	orders.stream().collect(Collectors.groupingBy(o -> o.customerId, Collectors.summingDouble(o -> o.total)))
		.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
