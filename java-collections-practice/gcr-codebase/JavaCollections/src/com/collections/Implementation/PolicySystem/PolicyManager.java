package com.collections.Implementation.PolicySystem;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.TreeMap;

import java.util.Iterator;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class PolicyManager {
	private HashMap<String, Policy> hashMap = new HashMap<String, Policy>();
	private LinkedHashMap<String, Policy> linkedMap = new LinkedHashMap<String, Policy>();
	private TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<LocalDate, List<Policy>>();

	public void addPolicy(Policy p) {
		hashMap.put(p.getPolicyNumber(), p);
		linkedMap.put(p.getPolicyNumber(), p);

		if (!treeMap.containsKey(p.getExpiryDate())) {
			treeMap.put(p.getExpiryDate(), new ArrayList<>());
		}
		treeMap.get(p.getExpiryDate()).add(p);
	}

	public Policy getByNumber(String number) {
		return hashMap.get(number);
	}

	public List<Policy> getExpiringSoon() {
		LocalDate today = LocalDate.now();
		LocalDate nextMonth = today.plusDays(30);
		List<Policy> expiringSoon = new ArrayList<>();

		for (List<Policy> list : treeMap.subMap(today, nextMonth).values()) {
			expiringSoon.addAll(list);
		}

		return expiringSoon;
	}

	public void removeExpired() {
		LocalDate today = LocalDate.now();

		Iterator<Map.Entry<LocalDate, List<Policy>>> it = treeMap.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<LocalDate, List<Policy>> entry = it.next();
			if (entry.getKey().isBefore(today)) {
				for (Policy p : entry.getValue()) {
					hashMap.remove(p.getPolicyNumber());
					linkedMap.remove(p.getPolicyNumber());
				}
				it.remove();
			}
		}
	}

	public void displayInsertionOrder() {
		linkedMap.values().forEach(System.out::println);
	}
}
