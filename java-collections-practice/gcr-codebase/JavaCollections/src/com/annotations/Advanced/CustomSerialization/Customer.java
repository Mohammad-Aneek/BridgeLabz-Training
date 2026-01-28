package com.annotations.Advanced.CustomSerialization;

class Customer {
	@JsonField(name = "customer_id")
	int id = 101;

	@JsonField(name = "full_name")
	String name = "Alice";

	int age = 30;
}
