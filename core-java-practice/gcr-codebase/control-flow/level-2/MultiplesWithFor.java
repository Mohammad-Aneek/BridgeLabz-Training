import java.util.Scanner;

public class MultiplesWithFor {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input number
        int number = input.nextInt();

        // check for positive
        if (number < 1) {
            System.out.println("number not positive");
            input.close();
            return;
        }

        // display the results
        for (int counter = 100; counter >= 1; counter--) {
            if (counter % number == 0) {
                System.out.println(counter + " is a multiple of " + number);
            }
        } 

        // close the Scanner
        input.close();
    }
}
