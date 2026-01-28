package com.annotations.Advanced.CustomSerialization;

public class Main {
	public static void main(String[] args) throws Exception {
		Customer customer = new Customer();
		String json = JsonSerializer.toJson(customer);
		System.out.println(json);
	}
}
