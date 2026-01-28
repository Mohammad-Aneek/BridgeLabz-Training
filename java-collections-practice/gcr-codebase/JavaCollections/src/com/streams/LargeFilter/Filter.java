package com.streams.LargeFilter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filter {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("src/com/streams/LargeFilter/log.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.toLowerCase().contains("error")) {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
