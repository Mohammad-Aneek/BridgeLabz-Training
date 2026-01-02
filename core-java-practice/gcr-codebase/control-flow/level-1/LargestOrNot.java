import java.util.Scanner;

public class LargestOrNot {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // take 3 numbers as input
        int firstNumber = input.nextInt(), secondNumber = input.nextInt(), thirdNumber = input.nextInt();

        // check if the numbers are largest or not
        boolean isFirstLargest = false, isSecondLargest = false, isThirdLargest = false;

        if (firstNumber > secondNumber && firstNumber >thirdNumber) {
            isFirstLargest = true;
        } else if (secondNumber > firstNumber && secondNumber>thirdNumber) {
            isSecondLargest = true;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            isThirdLargest = true;
        }

        // display the output
        System.out.println("Is the first number the largest? " + (isFirstLargest?"Yes":"No"));
        System.out.println("Is the second number the largest? " + (isSecondLargest?"Yes":"No"));
        System.out.println("Is the Third number the largest? " + (isThirdLargest?"Yes":"No"));

        // close the Scanner
        input.close();
    }
}
