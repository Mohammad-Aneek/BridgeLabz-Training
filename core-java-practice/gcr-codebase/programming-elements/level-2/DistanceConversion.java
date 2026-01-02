import java.util.Scanner;

// to convert distance in inches to yards and miles
public class DistanceConversion {
    public static void main(String[] args) {
        // Create the Scanner object
        Scanner input = new Scanner(System.in);

        // taking distance in feet as input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // calculating yards and miles
        double distanceInYards = distanceInFeet/3;
        double distanceInMiles = distanceInFeet / (3 * 1760);

        // display the data
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);

        input.close();
    }
}

