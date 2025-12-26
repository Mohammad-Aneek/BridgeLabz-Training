import java.util.Scanner;

public class GuessingGame {
    private int startRange, endRange;

    public GuessingGame(int startRange, int endRange) {
        this.startRange = startRange;
        this.endRange = endRange;
    }

    private int generateGuess() {
        int myGuess = (int)(Math.random() * (endRange - startRange + 1) + startRange);
        return myGuess;
    }

    private boolean getFeeback(int guess, Scanner input) {
        System.out.println("Feedback for guess: ");
        System.out.println("1. Lower than the secret number");
        System.out.println("2. Higher than the secret number");
        System.out.println("3. The guess is correct");
        System.out.println("\nEnter option number for Feedback: ");

        int guessFeedback = -1;

        while (true) {
            guessFeedback = input.nextInt();

            if (guessFeedback == 1) {
                startRange = guess + 1;
            } else if (guessFeedback == 2) {
                endRange = guess - 1;
            } else if (guessFeedback == 3) {
                System.out.println("Thank You for playing");
                return true;
            } else {
                System.out.println("Inavlid input");
                continue;
            }

            return false;
        }
    }

    public void play() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int guess = generateGuess();
            System.out.println("My guess is " + guess);

            boolean gameWon = getFeeback(guess,input);

            if (gameWon) {
                break;
            }

            System.out.println("\n--------------------------------------------------------\n");
        }
        input.close();
    }
    
    public static void main(String[] args) {
        // Create the GuessingGame object
        GuessingGame game = new GuessingGame(1, 100);
        game.play();
    }
}
