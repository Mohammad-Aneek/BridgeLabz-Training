package com.json.Practice.ConvertList;

import java.util.ArrayList;
import java.util.List;

import tools.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Laptop", 999.99));
		products.add(new Product(2, "Mouse", 25.50));
		products.add(new Product(3, "Keyboard", 45.00));

		String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(products);
		System.out.println(jsonArray);
	}
}
