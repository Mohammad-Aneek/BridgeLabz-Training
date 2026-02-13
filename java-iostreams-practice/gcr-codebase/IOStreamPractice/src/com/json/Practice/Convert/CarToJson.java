package com.json.Practice.Convert;

import tools.jackson.databind.ObjectMapper;

public class CarToJson {
	public static void main(String[] args) throws Exception {
		Car car = new Car("Tesla", "Model S");
		ObjectMapper mapper = new ObjectMapper();

		String json = mapper.writeValueAsString(car);
		System.out.println(json);
	}
}
