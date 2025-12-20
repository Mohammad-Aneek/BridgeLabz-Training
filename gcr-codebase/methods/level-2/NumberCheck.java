import java.util.Scanner;

// to check Numbers
public class NumberCheck {
    public static boolean isPositive(int number) {
        if (number >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static byte compare(int number1, int number2) {
        if (number1 < number2) {
            return -1;
        } else if (number1 > number2) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        // Create the Scanner Object
        Scanner input = new Scanner(System.in);

        // array of length 5
        int []array = new int[5];

        // take 5 numbers as input
        for (int index = 0; index < array.length; index++) {
            array[index] = input.nextInt();
        }
        
        for (int number: array ) {
            if (isPositive(number)) {
                if (isEven(number)) {
                    System.out.println(number + " is even");
                } else {
                    System.out.println(number + " is odd");
                }
            } else {
                System.out.println(number + " is negative");
            }
        }

        int result = compare(array[0],array[4]);
        if (result == 0) {
            System.out.println("Equal");
        } else if (result == -1) {
            System.out.println("First element is smaller than the last");
        } else {
            System.out.println("First element is greater than the last");
        }

        // closing the Scanner
        input.close();
    }
}
