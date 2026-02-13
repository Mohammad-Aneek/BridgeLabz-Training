package com.json.Practice.Parse;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		String jsonInput = "[" + "{\"name\": \"Alice\", \"age\": 22}," + "{\"name\": \"Bob\", \"age\": 30},"
				+ "{\"name\": \"Charlie\", \"age\": 28}," + "{\"name\": \"David\", \"age\": 20}" + "]";

		JsonNode rootNode = mapper.readTree(jsonInput);

		System.out.println("Users older than 25:");
		System.out.println("--------------------");

		if (rootNode.isArray()) {
			for (JsonNode userNode : rootNode) {
				int age = userNode.get("age").asInt();

				if (age > 25) {
					String name = userNode.get("name").asText();
					System.out.println("Name: " + name + " | Age: " + age);
				}
			}
		}
	}
}
