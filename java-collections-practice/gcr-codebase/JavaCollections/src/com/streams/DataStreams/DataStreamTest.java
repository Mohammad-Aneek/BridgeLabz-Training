package com.streams.DataStreams;

import java.io.*;

public class DataStreamTest {
	public static void main(String[] args) throws IOException {
		try (DataOutputStream dos = new DataOutputStream(
				new FileOutputStream("src/com/streams/DataStreams/student.bin"))) {
			dos.writeInt(101);
			dos.writeUTF("John");
			dos.writeDouble(3.9);
		}
		try (DataInputStream dis = new DataInputStream(
				new FileInputStream("src/com/streams/DataStreams/student.bin"))) {
			System.out.println("ID: " + dis.readInt() + ", Name: " + dis.readUTF() + ", GPA: " + dis.readDouble());
		}
	}
}