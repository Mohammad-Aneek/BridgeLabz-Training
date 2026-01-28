package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class CircularBuffer {
	Queue<Integer> buffer;
	int maxSize;

	public CircularBuffer(int maxSize) {
		this.buffer = new LinkedList<Integer>();
		this.maxSize = maxSize;
	}

	public void add(int value) {
		if (buffer.size() == maxSize) {
			buffer.poll();
		}
		buffer.add(value);
	}

	public Integer poll() {
		if (!buffer.isEmpty()) {
			return buffer.poll();
		}

		return null;
	}

	public boolean isEmpty() {
		return buffer.isEmpty();
	}

	public static void main(String[] args) {
		CircularBuffer circularBuffer = new CircularBuffer(3);
		circularBuffer.add(1);
		circularBuffer.add(2);
		circularBuffer.add(3);
		circularBuffer.add(4);

		while (!circularBuffer.isEmpty()) {
			System.out.println(circularBuffer.poll());
		}
	}
}
