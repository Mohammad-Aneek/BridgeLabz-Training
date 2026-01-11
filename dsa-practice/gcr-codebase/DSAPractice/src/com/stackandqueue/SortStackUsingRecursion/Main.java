package com.stackandqueue.SortStackUsingRecursion;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		StackExtra stackHelper = new StackExtra();
		Stack<Integer> stack = new Stack<>();
		Scanner input = new Scanner(System.in);

		System.out.println("Recursive Stack Sorter");

		while (true) {
			System.out.println("\nSelect an operation:");
			System.out.println("1. Push Element\n2. Sort Stack (Recursively)\n3. Display Stack\n4. Exit");
			System.out.print("Enter choice: ");

			int choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter an integer to push: ");
				int num = input.nextInt();
				stack.push(num);
				System.out.println("Pushed: " + num);
				break;

			case 2:
				if (stack.isEmpty()) {
					System.out.println("Stack is empty, nothing to sort.");
				} else {
					stackHelper.sort(stack);
					System.out.println("Stack sorted!");
				}
				break;

			case 3:
				System.out.print("Stack Content (Bottom -> Top): ");
				stackHelper.display(stack);
				System.out.println();
				break;

			case 4:
				System.out.println("Exiting...");
				input.close();
				return;

			default:
				System.out.println("Invalid choice. Please enter 1-4.");
			}

		}
	}

}
