package com.reflection.Advanced.ObjectMapper;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception {
		HashMap<String, Object> data = new HashMap<>();
		data.put("username", "SuperCoder");
		data.put("points", 500);

		User u = ObjectMapper.toObject(User.class, data);
		System.out.println(u);
	}

}
