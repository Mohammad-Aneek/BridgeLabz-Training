import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input base and exponent
        int base = input.nextInt();
        int exponent = input.nextInt();

        // check values for positive
        if ( base < 1 || exponent < 1 ) {
            System.out.println("Number(s) not positive");
            input.close();
            return;
        }

        //calculate the result
        int result = 1;
        int counter = 1;

        while (counter <= exponent) {
            result *= base;
            counter++;
        }

        // display the result 
        System.out.println(result);

        // close the Scanner
        input.close();
    }
}
