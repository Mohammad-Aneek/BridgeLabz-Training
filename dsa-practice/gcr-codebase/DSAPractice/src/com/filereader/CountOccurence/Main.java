package com.filereader.CountOccurence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		int count = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("src/com/filereader/CountOccurence/Text.txt"))) {

			String line;
			while ((line = br.readLine()) != null) {
				line = line.replaceAll("[^a-zA-Z ]", "");
				String[] words = line.split(" ");
				for (String word : words) {
					if (word.equalsIgnoreCase("Netflix")) {
						count++;
					}
				}
			}
			System.out.println("Occurrences of 'Netflix': " + count);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
