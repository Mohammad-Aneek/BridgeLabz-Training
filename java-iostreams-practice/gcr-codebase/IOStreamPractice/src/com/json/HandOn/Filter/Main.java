package com.json.HandOn.Filter;

import java.io.File;
import java.util.List;
import java.util.Map;
import tools.jackson.databind.ObjectMapper;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			File file = new File("src/com/files/json/users_list.json");

			List<Map<String, Object>> users = mapper.readValue(file, List.class);

			for (Map<String, Object> user : users) {
				int age = (int) user.get("age");

				if (age > 25) {
					System.out.println("Name: " + user.get("name") + " | Age: " + age);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}