package com.junit.main.Basic.FileHandlingTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessor {
	public void writeToFile(String filename, String content) throws IOException {
		try (FileWriter writer = new FileWriter(filename)) {
			writer.write(content);
		}
	}

	public String readFromFile(String filename) throws IOException {
		StringBuilder content = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = reader.readLine()) != null) {
				content.append(line);
			}
		}
		return content.toString();
	}
}
