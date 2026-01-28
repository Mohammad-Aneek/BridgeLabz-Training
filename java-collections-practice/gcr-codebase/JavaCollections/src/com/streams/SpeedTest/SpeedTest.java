package com.streams.SpeedTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SpeedTest {
	public static void main(String[] args) throws IOException {
		long start = System.nanoTime();
		try (BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("src/com/streams/SpeedTest/source.txt"));
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream("src/com/streams/SpeedTest/dest.txt"))) {
			byte[] buffer = new byte[4096];
			int bytesRead;
			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}
		}
		long end = System.nanoTime();
		System.out.println("Time taken: " + (end - start) / 1_000_000 + " ms");
	}
}
