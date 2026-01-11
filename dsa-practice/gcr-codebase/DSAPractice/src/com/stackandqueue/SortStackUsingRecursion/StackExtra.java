package com.stackandqueue.SortStackUsingRecursion;

import java.util.Stack;

public class StackExtra {
	public void sort(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}

		int top = stack.pop();

		sort(stack);
		insert(stack, top);
	}

	private void insert(Stack<Integer> stack, int top) {
		if (stack.isEmpty()) {
			stack.push(top);
		} else if (stack.peek() < top) {
			int peekedTop = stack.pop();
			insert(stack, top);
			stack.push(peekedTop);
		} else {
			stack.push(top);
		}
	}

	public void display(Stack<Integer> stack) {
		if (!stack.empty()){
			int top = stack.pop();
			display(stack);
			System.out.print(top + " ");
			stack.push(top);
		}
	}
}
