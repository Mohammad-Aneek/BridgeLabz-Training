package com.streams.ByteArray;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageByte {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/com/streams/ByteArray/Cat.jpg");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		byte[] buffer = new byte[1024];
		int len;
		while ((len = fis.read(buffer)) != -1)
			baos.write(buffer, 0, len);

		byte[] imageBytes = baos.toByteArray();

		try (FileOutputStream fos = new FileOutputStream("src/com/streams/ByteArray/copy_cat.jpg")) {
			fos.write(imageBytes);
		}
		System.out.println("Image recreated from byte array.");
	}
}
