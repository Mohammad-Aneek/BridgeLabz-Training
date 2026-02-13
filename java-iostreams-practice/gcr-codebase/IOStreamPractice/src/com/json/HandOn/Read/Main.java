package com.json.HandOn.Read;

import java.io.File;
import java.util.Map;
import tools.jackson.databind.ObjectMapper;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			File file = new File("src/com/files/json/user.json");

			Map<String, Object> userData = mapper.readValue(file, Map.class);

			for (Map.Entry<String, Object> entry : userData.entrySet()) {
				System.out.println(entry.getKey() + " => " + entry.getValue());
			}

		} catch (Exception e) {
			System.err.println("Error reading JSON: " + e.getMessage());
			e.printStackTrace();
		}
	}
}