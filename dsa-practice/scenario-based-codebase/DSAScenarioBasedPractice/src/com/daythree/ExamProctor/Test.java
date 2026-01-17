package com.daythree.ExamProctor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Test {
	ArrayList<Question> questions;
	Stack<Integer> navigatinRecord;
	HashMap<Integer, Integer> choices;
	boolean quizStarted;
	int currentlyAt;

	public Test() {
		this.questions = new ArrayList<Question>();
		this.navigatinRecord = new Stack<Integer>();
		this.choices = new HashMap<Integer, Integer>();
		this.quizStarted = false;
		this.currentlyAt = -1;
	}

	public void addQuestion(String question, int answer, String option1, String option2, String... options) {
		questions.add(new Question(question, answer, option1, option2, options));
		if (currentlyAt == -1) {
			currentlyAt = 0;
		}
	}

	public boolean startQuiz() {
		if (questions.size() > 0) {
			quizStarted = true;
			switchToQuestion(1);
			return true;
		} else {
			return false;
		}
	}

	public void switchToQuestion(int position) {
		if (quizStarted && position > 0 && position <= questions.size()) {
			currentlyAt = position - 1;
			navigatinRecord.push(position);
		}
	}

	public void viewQuestion() {
		if (quizStarted) {
			questions.get(currentlyAt).display();
		}
	}

	public void answerCurrentQuestion(int choice) {
		if (quizStarted) {
			choices.put(currentlyAt, choice);
		}
	}

	public void generateReport() {
		if (!quizStarted) {
			return;
		}
		int correct = 0;
		for (int i = 0; i < questions.size(); i++) {
			correct += questions.get(i).isAnswerCorrect(choices.get(i)) ? 1 : 0;
		}
		System.out.println(correct + " out of " + questions.size());
	}
}
