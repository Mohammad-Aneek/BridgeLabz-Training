import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input a number
        int number = input.nextInt();

        // display the Multiplication Table 
        for (int counter = 6; counter <= 9; counter++) {
            int product = counter * number;
            System.out.printf("%d * %d = %d%n",number,counter,product);
        }

        // close the Scanner
        input.close();
    }
}
