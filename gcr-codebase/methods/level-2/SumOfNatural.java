import java.util.Scanner;

// to get sum of Sum of numbers in range from 1 to some number using recursion
public class SumOfNatural {
    public static int getSumUsingRecursion(int number) {
        if (number <= 0) {
            return 0;
        }

        int sum = number + getSumUsingRecursion(number - 1);
        return sum;
    }

    public static int getSumUsingFormula(int number) {
        int sum = number * (number + 1) / 2;
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object;
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number");
            input.close();
            return;
        }

        int sumUsingRecursion = getSumUsingRecursion(number);
        int sumUsingFormula = getSumUsingFormula(number);

        System.out.println("The sum of natural numbers upto "+ number + " using recursion is " + sumUsingRecursion);

        System.out.println("The sum of natural numbers upto "+ number + " using formula is " + sumUsingFormula);
        
        if (sumUsingFormula == sumUsingRecursion) {
            System.out.println("Both are same");
        }

        // close the Scanner
        input.close();
    }
}
