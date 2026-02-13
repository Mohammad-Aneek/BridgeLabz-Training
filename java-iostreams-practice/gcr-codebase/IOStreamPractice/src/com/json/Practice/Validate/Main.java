package com.json.Practice.Validate;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();

		String jsonInput = "{ \"id\": 101, \"name\": \"Bob\" }";

		try {
			JsonNode rootNode = mapper.readTree(jsonInput);

			boolean hasId = rootNode.has("id") && rootNode.get("id").isNumber();
			boolean hasEmail = rootNode.has("email") && rootNode.get("email").isString();

			if (hasId && hasEmail) {
				System.out.println("Validation Successful!");
			} else {
				System.out.println("Validation Failed!");
				if (!hasId)
					System.out.println(" - Missing or invalid field: 'id'");
				if (!hasEmail)
					System.out.println(" - Missing or invalid field: 'email'");
			}

		} catch (Exception e) {
			System.err.println("Invalid JSON format: " + e.getMessage());
		}
	}
}
