// Class to convert distance in kilometers To miles
public class KilometersToMiles {

    // Method that performs the conersion of distance
    static double convert(double distanceInKilometers) {
        // convert distance from Kilometers to Miles and store it
        double distanceInMiles = distanceInKilometers * 1.6;

        // return the converted distance
        return distanceInMiles;
    }

    public static void main(String[] args) {
        // Double variable to store the distance in kilometers
        double distanceInKilometers = 10.8;

        // Using the KilometersToMiles Class's convert method
        // and storing the result in a new Double variable
        double distanceInMiles = KilometersToMiles.convert(distanceInKilometers);

        // Display the result
        System.out.println("The distance " + distanceInKilometers + " km in miles is " + distanceInMiles + " miles");
    }
}
