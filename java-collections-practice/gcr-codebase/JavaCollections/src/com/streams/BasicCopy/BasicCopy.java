package com.streams.BasicCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BasicCopy {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("src/com/streams/BasicCopy/source.txt");
				FileOutputStream fos = new FileOutputStream("src/com/streams/BasicCopy/dest.txt")) {
			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("File copied.");
		} catch (FileNotFoundException e) {
			System.out.println("Source file not found!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
