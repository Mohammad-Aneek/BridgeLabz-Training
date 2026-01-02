import java.util.Scanner;

// to display Multiplication Table of number
public class MultiplicationTable {
    public static void main(String[] args) {
        // Create the Scanner Object
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int []table = new int[10];

        if (number < 6 && 9 < number) {
            System.out.println("Invalid number");
            input.close();
            return;
        }

        for (int counter = 1; counter <= table.length; counter++) {
            table[counter-1] = number*counter;
        }

        for (int counter = 1; counter <= table.length; counter++) {
            System.out.println( number + " * " + counter + " = " + table[counter-1]);
        }

        // closing the Scanner
        input.close();
    }
}
