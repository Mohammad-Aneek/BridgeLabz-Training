package com.streams.PipedStreams;

import java.io.*;

public class Pipe {
	public static void main(String[] args) throws IOException {
		PipedOutputStream out = new PipedOutputStream();
		PipedInputStream in = new PipedInputStream(out);

		new Thread(() -> {
			try {
				out.write("Hello from Thread!".getBytes());
				out.close();
			} catch (IOException e) {
			}
		}).start();

		new Thread(() -> {
			try {
				int i;
				while ((i = in.read()) != -1) {
					System.out.print((char) i);
				}
			} catch (IOException e) {
			}
		}).start();
	}
}
