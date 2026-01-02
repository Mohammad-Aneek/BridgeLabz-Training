import java.util.Scanner;

// to take age of 10 students and check their voting eligibility
public class NumberCheck {
    public static void main(String[] args) {
        // Create the Scanner Object
        Scanner input = new Scanner(System.in);

        // array of length 5
        int []array = new int[5];

        // take 5 numbers as input
        for (int index = 0; index < array.length; index++) {
            array[index] = input.nextInt();
        }

        for (int index = 0; index < array.length; index++) {
            if (array[index] < 0 ) {
                System.out.println("Negative");
            } else if (array[index] == 0) {
                System.out.println("Zero");
            } else if (array[index] % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }

        if (array[0] == array[array.length-1] ) {
            System.out.println("Equal");
        } else if (array[0] < array[array.length-1]) {
            System.out.println("First element is smaller than the last");
        } else {
            System.out.println("First element is greater than the last");
        }

        // closing the Scanner
        input.close();
    }
}
