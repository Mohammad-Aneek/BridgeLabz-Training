package com.dayfour.EduMentor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question {
	private boolean valid;
	private String question;
	private List<String> options;
	private int correctOption;

	public Question() {
		this.valid = false;
		this.question = null;
		this.options = new ArrayList<String>();
		this.correctOption = -1;
	}

	public Question(String question, List<String> options, int correctOption) {
		this.valid = true;
		this.question = question;
		this.options = options;
		this.correctOption = correctOption;
	}

	public void setUpQuestion(String question, List<String> options, int correctOption) {
		if (!valid && options.size() < 2) {
			this.valid = true;
			this.question = question;
			this.options = options;
			this.correctOption = correctOption;
		} else {
			System.out.println("Operation failed");
		}
	}

	public boolean testQuestion() {
		if (valid) {
			System.out.println("---------------------------------------------------------------");
			Scanner input = new Scanner(System.in);
			System.out.println("Ques: " + question);
			System.out.println("---------------------------------------------------------------");
			char marker = 'A';
			for (String option : options) {
				System.out.println(marker + ". " + option);
				marker = (char)(marker + 1);
			}
			System.out.println("---------------------------------------------------------------");
			System.out.print("Choose the option: ");
			boolean correct = correctOption == (input.next().toUpperCase().charAt(0) - 'A');
			System.out.println("---------------------------------------------------------------");
//			input.close();
			if (correct) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public boolean isValid() {
		return valid;
	}
}
