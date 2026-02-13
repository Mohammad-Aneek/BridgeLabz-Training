package com.json.Practice.ReadExtract;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) throws JacksonException, FileNotFoundException {
		ObjectMapper mapper = new ObjectMapper();

		FileInputStream fis = new FileInputStream("src/com/files/json/user.json");
		BufferedInputStream bis = new BufferedInputStream(fis);

		JsonNode data = mapper.readTree(bis);
		System.out.println(data.toPrettyString());
	}
}
