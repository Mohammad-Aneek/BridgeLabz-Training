package com.junit.test.Basic.FileHandlingTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.junit.main.Basic.FileHandlingTest.FileProcessor;

class FileProcessorTest {

	FileProcessor processor = new FileProcessor();
	String testFile = "junit_test.txt";

	@Test
	void testWriteAndRead() throws IOException {
		String data = "Hello, Eclipse and JUnit!";

		processor.writeToFile(testFile, data);
		String result = processor.readFromFile(testFile);

		assertEquals(data, result);

	}

	@Test
	void testFileNotFoundThrowsException() {
		assertThrows(IOException.class, () -> {
			processor.readFromFile("non_existent_file.txt");
		});
	}

}
