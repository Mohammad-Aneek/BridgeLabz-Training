package com.dayfour.EduMentor;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor(1, "Vishal sir", "Vishal.Sir@Example.com");
        Learner learner = new Learner(1, "Aneek", "Aneek@Example.com");

        Quiz javaQuiz = new Quiz("Java Fundamentals");
        
        javaQuiz.addQuestions(
            "Which is a primitive type?", 
            Arrays.asList("String", "int", "ArrayList"), 
            1 
        );
        javaQuiz.addQuestions(
            "Java is...?", 
            Arrays.asList("Object Oriented", "Procedural", "Functional"), 
            0 
        );

        Course bootCamp = new ShortCourse("Java Crash Course", instructor, javaQuiz);
        Course degree = new LongCourse("Advanced Software Eng", instructor, javaQuiz);

        bootCamp.addLearner(learner);
        
        bootCamp.displayDetails();
        bootCamp.generateCertificate();

        degree.displayDetails();
        degree.generateCertificate();

        javaQuiz.startQuiz();
	}

}
