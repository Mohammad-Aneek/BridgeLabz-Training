package com.dayfour.EduMentor;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
	private String name;
	private List<Question> questions;
	private int score;
	private int validQuestion;

	Quiz(String name) {
		this.name = name;
		this.questions = new ArrayList<Question>();
		this.score = 0;
		this.validQuestion = 0;
	}

	public void addQuestions(String question, List<String> options, int correctOption) {
		Question newQuestion = new Question(question, options, correctOption);
		questions.add(newQuestion);

		if (newQuestion.isValid()) {
			validQuestion++;
		}
	}

	public void fixQuestion(int index, String question, List<String> options, int correctOption) {
		Question questionToFix = questions.get(index);
		questionToFix.setUpQuestion(question, options, correctOption);

		if (questionToFix.isValid()) {
			validQuestion++;
		}
	}

	public void startQuiz() {
		System.out.println(name);
		for (Question question : questions) {
			score += question.testQuestion() ? 1 : 0;
		}

		System.out.println("The score is " + score + " out of " + validQuestion);
	};

	@Override
	public String toString() {
		return name;
	}
}
