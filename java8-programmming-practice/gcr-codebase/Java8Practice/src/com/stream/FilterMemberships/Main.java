package com.stream.FilterMemberships;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
	List<Member> members = Arrays.asList(new Member("Alice", "2026-02-10"), new Member("Bob", "2026-05-20"),
new Member("Charlie", "2026-02-28"), new Member("David", "2025-01-01"));

	LocalDate today = LocalDate.of(2026, 2, 2);
	LocalDate lastDay = today.plusDays(30);

	members.stream().filter(m -> today.isBefore(m.expiryDate) && lastDay.isAfter(m.expiryDate)).forEach(System.out::println);
    }
}
