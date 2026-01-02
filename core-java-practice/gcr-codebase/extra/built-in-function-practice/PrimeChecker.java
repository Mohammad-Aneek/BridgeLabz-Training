import java.util.Scanner;

public class PrimeChecker {
    // takes a single number as input
    public static int takeInput() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        return number;
    }

    // checks if the number is prime
    public static boolean isPrime(int number) {
        // check for valid prime
        if (number <= 1) {
            return false;
        }

        // check for prime by testing divisibility
        for (int counter = 2; counter < number; counter++) {
            if (number % counter == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number = takeInput();
        boolean result = isPrime(number);

        if (result) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }
}
