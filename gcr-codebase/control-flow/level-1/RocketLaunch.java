import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // get a number as input 
        int startNumber  = input.nextInt();

        // start countdown
        while (startNumber > 0) {
            System.out.println(startNumber);
            startNumber--;
        }

        // closing the scanner object
        input.close();
    }
}
