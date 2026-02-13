package com.json.Practice.Merge;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.node.ObjectNode;

public class Main {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();

		ObjectNode node1 = mapper.createObjectNode();
		node1.put("name", "Alice");
		node1.put("age", 30);

		ObjectNode node2 = mapper.createObjectNode();
		node2.put("city", "New York");
		node2.put("country", "USA");

		ObjectNode merged = mapper.createObjectNode();

		JsonNode mergedNode = merged.setAll(node1).setAll(node2).deepCopy();
		System.out.println(mergedNode.toPrettyString());

	}
}
