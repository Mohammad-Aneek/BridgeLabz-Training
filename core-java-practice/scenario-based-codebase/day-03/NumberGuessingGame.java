/* 7. The Number Guessing Game 🎲
 * A game asks the player to guess a number between 1 and 100.
 * Core Java Scenario Based Problem Statements
 * ● Use do-while loop.
 * ● Give hints like "Too high" or "Too low".
 * ● Count attempts and exit after 5 wrong tries.
*/

import java.util.Scanner;

public class NumberGuessingGame {
    public void play() {
        // create a scanner object
        Scanner input = new Scanner(System.in);

        // generate the secretNumber
        int secretNumber = (int)(Math.random() * 100) + 1;

        System.out.println("Welcome to the number guessing game: ");
        System.out.println("The objective of this game is to choose the secret number.");
        System.out.println("You will get a hint after each guess.");
        System.out.println("The number of choices are limited so play carefully.");
        System.out.println();
        
        int guesses = 0;
        while (guesses < 5) {
            System.out.println();
            System.out.println("Guesses left: " + (5 - guesses));
            System.out.print("Enter your guess (1-100): ");
            int choice = input.nextInt();

            if (choice < 1 || 100 < choice ) {
                // handling invalid inputs
                System.out.println("Your choice is out of the world. Please try again.");
            } else if (choice == secretNumber) {
                // handling correct guess
                System.out.println("Your guess is correct. You won the game");
                System.out.println("You guessed in " + (guesses + 1 ) + " tries.");
                return;
            } else {
                // handling wrong valid guesses
                System.out.println("The guess is wrong.");
                guesses++;
                if (guesses == 5) {
                    break;
                }
                if (choice < secretNumber) {
                    System.out.println("Hint: The secret number is greater than your guess");
                } else {
                    System.out.println("Hint: The secret number is smaller than your guess");
                }
            }
        }

        System.out.println("You lost! The secret number was " + secretNumber);
    }
    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame();
        game.play();
    }
}
