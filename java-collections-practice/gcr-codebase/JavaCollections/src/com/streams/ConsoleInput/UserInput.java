package com.streams.ConsoleInput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				FileWriter writer = new FileWriter("src/com/streams/ConsoleInput/user.txt")) {
			System.out.print("Name: ");
			String name = reader.readLine();
			System.out.print("Age: ");
			String age = reader.readLine();
			writer.write("Name: " + name + "\nAge: " + age);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
