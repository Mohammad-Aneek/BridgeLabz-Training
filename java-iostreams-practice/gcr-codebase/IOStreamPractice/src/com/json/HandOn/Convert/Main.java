package com.json.HandOn.Convert;

import java.util.ArrayList;
import java.util.List;
import tools.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<User> userList = new ArrayList<>();

		userList.add(new User("Amit Sharma", 28));
		userList.add(new User("Sita Verma", 22));

		try {
			String jsonOutput = mapper.writeValueAsString(userList);
			System.out.println(jsonOutput);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}