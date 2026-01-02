import java.util.Scanner;

public class FibonacciGenerator {
    // takes the number of terms as input
    public static int takeInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = input.nextInt();
        input.close();
        return terms;
    }

    // generates and prints the Fibonacci sequence
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            // calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int terms = takeInput();
        generateFibonacci(terms);
    }
}
