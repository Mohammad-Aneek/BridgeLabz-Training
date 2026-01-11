package com.stackandqueue.QueueUsingStack;

import java.util.Stack;

public class QueueImplementation {
	// stack for enqueue such that before enqueue operation all elements need to be
	// in this stack
	private Stack<String> enqueueStack;
	// stack for dequeue such that before dequeue operation all elements need to be
	// in this stack
	private Stack<String> dequeueStack;

	public QueueImplementation() {
		this.enqueueStack = new Stack<String>();
		this.dequeueStack = new Stack<String>();
	}

	public boolean offer(String string) {
		// moving each element to enqueue stack
		while (!dequeueStack.isEmpty()) {
			enqueueStack.push(dequeueStack.pop());
		}
		enqueueStack.push(string);
		return true;
	}

	public String poll() {
		// checking if there are elements or not
		if (this.isEmpty()) {
			return null;
		}

		// moving each element to dequeue stack
		while (!enqueueStack.isEmpty()) {
			dequeueStack.add(enqueueStack.pop());
		}

		return dequeueStack.pop();
	}

	public String peek() {
		// checking if there are elements or not
		if (this.isEmpty()) {
			return null;
		}

		// moving each element to dequeue stack
		while (!enqueueStack.isEmpty()) {
			dequeueStack.add(enqueueStack.pop());
		}

		return dequeueStack.peek();

	}

	public boolean isEmpty() {
		return enqueueStack.isEmpty() && dequeueStack.isEmpty();
	}
}
