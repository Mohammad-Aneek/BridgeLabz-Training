package com.daythree.ExamProctor;

import java.util.ArrayList;
import java.util.Arrays;

public class Question {
	private String question;
	private ArrayList<String> options;
	private int answer;

	public Question(String question, int answer, String option1, String option2, String... options) {
		this.question = question;
		this.answer = answer;
		this.options = new ArrayList<String>();
		this.options.add(option1);
		this.options.add(option2);
		this.options.addAll(Arrays.asList(options));
	}

	public boolean isAnswerCorrect(int choice) {
		return answer == choice;
	}

	public void display() {
		System.out.println("-------------------------------------------------------");
		System.out.println(question);
		System.out.println("-------------------------------------------------------");
		for (int i = 0; i < options.size(); i++) {
			System.out.println((i + 1) + ": " + options.get(i));
		}
		System.out.println("-------------------------------------------------------");
	}
}
