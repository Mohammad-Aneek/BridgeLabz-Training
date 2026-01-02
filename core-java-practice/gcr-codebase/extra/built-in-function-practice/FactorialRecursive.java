import java.util.Scanner;

public class FactorialRecursive {
    // takes a number as input
    public static int takeInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        return number;
    }

    // calculates factorial using recursion
    public static long calculateFactorial(int number) {
        // base case
        if (number <= 1) {
            return 1;
        }

        // recursive case
        return number * calculateFactorial(number - 1);
    }

    // displays the result
    public static void displayResult(int number, long factorial) {
        System.out.println("Factorial of " + number + " = " + factorial);
    }

    public static void main(String[] args) {
        int number = takeInput();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            return;
        }

        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }
}
