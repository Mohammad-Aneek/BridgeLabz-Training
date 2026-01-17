package com.daythree.ExamProctor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Test exam = new Test();

		exam.addQuestion("What is the time complexity of Stack push?", 1, "O(1)", "O(n)", "O(log n)");
		exam.addQuestion("Which map allows null keys in Java?", 2, "TreeMap", "HashMap", "HashTable");
		exam.addQuestion("Which keyword is used to start a thread?", 3, "run", "init", "start");

		if (!exam.startQuiz()) {
			input.close();
			return;
		}

		boolean takingExam = true;

		while (takingExam) {
			System.out.println("\n========================================");
			System.out.println("       CURRENT QUESTION: " + (exam.currentlyAt + 1));
			System.out.println("========================================");

			exam.viewQuestion();

			System.out.println("\n[MENU] 1. Answer  |  2. Jump to Question  |  3. Submit Exam");
			System.out.print("Action: ");

			int action = input.nextInt();

			switch (action) {
			case 1:
				System.out.print("Enter your choice (number): ");
				int choice = input.nextInt();
				exam.answerCurrentQuestion(choice);
				System.out.println(">> Answer saved.");
				break;

			case 2:
				System.out.print("Enter Question ID (1-" + exam.questions.size() + "): ");
				int qId = input.nextInt();
				if (qId > 0 && qId <= exam.questions.size()) {
					exam.switchToQuestion(qId);
				} else {
					System.out.println(">> Invalid Question ID.");
				}
				break;

			case 3:
				System.out.println("\nSubmitting your exam...");
				takingExam = false;
				break;

			default:
				System.out.println(">> Invalid action.");
			}
		}

		exam.generateReport();

		input.close();
	}
}
