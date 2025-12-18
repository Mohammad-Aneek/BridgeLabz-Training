import java.util.Scanner;

public class MultiplesWithWhile {
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
        int counter = 100;
        while (counter >= 1) {
            if (counter % number == 0) {
                System.out.println(counter + " is a multiple of " + number);
            }
            counter--;
        } 

        // close the Scanner
        input.close();
    }
}
