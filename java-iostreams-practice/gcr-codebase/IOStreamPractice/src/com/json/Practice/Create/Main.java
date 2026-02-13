package com.json.Practice.Create;

import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.node.ArrayNode;
import tools.jackson.databind.node.ObjectNode;

public class Main {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();

		ObjectNode student = mapper.createObjectNode();
		student.put("name", "John Doe");
		student.put("age", 22);

		ArrayNode subjects = mapper.createArrayNode();
		subjects.add("Math").add("Physics").add("CS");

		student.set("subjects", subjects);
		System.out.println(student.toPrettyString());
	}
}
