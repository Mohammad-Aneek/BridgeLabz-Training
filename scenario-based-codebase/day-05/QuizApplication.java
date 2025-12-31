/* 17. Online Quiz Application 🧠
 * Ask 5 questions (MCQs) from a user.
 * ● Use arrays and for-loop.
 * ● Record score.
 * ● Switch for answer checking. Apply clear indentation and structured layout.
 */

import java.util.Scanner;

public class QuizApplication {
    private String [][]questions;
    private char []correctAnswers;
    private char []selectedAnswers;

    QuizApplication() {
        questions = new String[][]{
            {
                "What is the correct extension for Java source files?",
                ".js", 
                ".txt", 
                ".class", 
                ".java"
            },
            {
                "Which method is the entry point for a Java program?",
                "start()",
                "main()", 
                "run()", 
                "init()"
            },
            {
                "Which command is used to print text to the console?", 
                "console.log()",
                "print()",
                "System.out.println()",
                "echo"
            },
            {
                "What is the default value of an 'int' variable?", 
                "0", 
                "1", 
                "null", 
                "undefined"
            },
            {
                "Which keyword is used to create an object?", 
                "class", 
                "obj", 
                "new", 
                "create"
            }
        };
        correctAnswers = new char[]{'D', 'B', 'C', 'A', 'C'};
        selectedAnswers = new char[5];
    }

    private void displayQuestion(int i, Scanner input) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Ques " + (i+1) + ": " +questions[i][0]);
        System.out.println("--------------------------------------------------------");
        System.out.println("A. " + questions[i][1]);
        System.out.println("B. " + questions[i][2]);
        System.out.println("C. " + questions[i][3]);
        System.out.println("D. " + questions[i][4]);
        System.out.println("--------------------------------------------------------");
        System.out.print  ("Enter your answer: ");
        selectedAnswers[i] = input.next().toUpperCase().charAt(0);
        System.out.println("--------------------------------------------------------");

    }

    private void generateResults() {
        int correct = 0;
        System.out.println(">-< >-< >-< >-< >-< >-< >-< >-< >-< >-< >-< >-< >-< >-<");
        System.out.println("                    FINAL RESULT                       ");
        System.out.println(">-< >-< >-< >-< >-< >-< >-< >-< >-< >-< >-< >-< >-< >-<");
        for (int i = 0; i < 5; i++) {

            System.out.println("--------------------------------------------------------");
            System.out.println("Ques " + (i+1) + ": " +questions[i][0]);
            System.out.println("--------------------------------------------------------");

            if (selectedAnswers[i] == correctAnswers[i]) {
                correct++;
                System.out.println("Result: Your answer is correct.");
                System.out.println("Answer: " + selectedAnswers[i] + ". " + questions[i][selectedAnswers[i] - 'A']);
                System.out.println("--------------------------------------------------------");
            }else {
                System.out.println("Result: Your answer is wrong.");
                System.out.println("Selected Answer: " + selectedAnswers[i] + ". " + questions[i][selectedAnswers[i] - 'A' + 1]);
                System.out.println("Correct Answer : " + correctAnswers[i] + ". " + questions[i][correctAnswers[i] - 'A']);
                System.out.println("--------------------------------------------------------");
            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Your score is " + (20 * correct) + "%");
        System.out.println("--------------------------------------------------------");

    }
    public void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("Online quiz Application");

        for (int i = 0; i < 5; i++) {
            displayQuestion(i,input);
        }
        generateResults();
    } 
    public static void main(String[] args) {
         QuizApplication quiz = new QuizApplication();
         quiz.start();
    }
}
