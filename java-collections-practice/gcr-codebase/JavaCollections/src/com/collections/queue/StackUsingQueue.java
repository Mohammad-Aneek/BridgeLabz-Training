package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	public void push(int x) {
		while (!q1.isEmpty()) {
			q2.add(q1.poll());
		}

		q1.add(x);

		while (!q2.isEmpty()) {
			q1.add(q2.poll());
		}
	}

	public int pop() {
		return q1.poll();
	}

	public boolean isEmpty() {
		return q1.isEmpty() && q2.isEmpty();
	}

	public static void main(String[] args) {
		StackUsingQueue stack = new StackUsingQueue();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
