package com.streams.CaseConversion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LowerCaseConvertor {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("src/com/streams/CaseConversion/UPPER.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/streams/CaseConversion/lower.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line.toLowerCase());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
