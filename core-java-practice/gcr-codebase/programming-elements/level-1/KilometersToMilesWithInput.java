import java.util.Scanner;

// Class to convert distance in kilometers To miles
public class KilometersToMilesWithInput {

    // Method that performs the conersion of distance
    static double convert(double distanceInKilometers) {
        // convert distance from Kilometers to Miles and store it
        double distanceInMiles = distanceInKilometers * 1.6;

        // return the converted distance
        return distanceInMiles;
    }

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Double variable to store the distance in kilometers
        System.out.print("Enter the distance (in kilometers): ");
        double distanceInKilometers = sc.nextDouble();

        // Using the KilometersToMiles Class's convert method
        // and storing the result in a new Double variable
        double distanceInMiles = KilometersToMiles.convert(distanceInKilometers);

        // Display the result
        System.out.println("The distance " + distanceInKilometers + " km in miles is " + distanceInMiles + " miles");

        // Closing the Scanner Object
        sc.close();
    }
}
