import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // get a number as input 
        int startNumber  = input.nextInt();

        // start countdown
        for ( int i = startNumber; i > 0 ; i--) {
            System.out.println(i);
        }

        // closing the scanner object
        input.close();
    }
}
