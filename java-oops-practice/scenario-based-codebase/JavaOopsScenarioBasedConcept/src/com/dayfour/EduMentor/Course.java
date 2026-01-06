package com.dayfour.EduMentor;

import java.util.ArrayList;
import java.util.List;

public abstract class Course implements ICertifiable {

	protected String name;
	protected Instructor instructor;
	protected List<Learner> learners;
	protected Quiz quiz;
	protected int duration;

	public Course(String name, Instructor instructor, Quiz quiz, int duration) {
		this.name = name;
		this.instructor = instructor;
		this.quiz = quiz;
		this.learners = new ArrayList<Learner>();
		this.duration = duration;
	}

	public void addLearner(Learner learner) {
		this.learners.add(learner);
	}

	abstract void displayDetails();

}
