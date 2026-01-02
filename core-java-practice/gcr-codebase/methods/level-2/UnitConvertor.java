import java.util.Scanner;

public class UnitConvertor {

    private UnitConvertor() {}

    // to covert from kilometers to miles
    public static double convertKmToMiles(double kilometers) {
        double miles = kilometers * 0.621371;
        return miles;
    }

    // to convert from miles to kilometers
    public static double convertMilesToKm(double miles) {
        double kilometers = miles * 1.60934;
        return kilometers;
    }

    // to convert from meters to feet
    public static double convertMetersToFeet(double meters) {
        double feet = meters * 3.28084;
        return feet;
    }

    // to convert from feet to meters
    public static double convertFeetToMeters(double feet) {
        double meters = feet * .3048;
        return meters;
    }

    // to convert from yards to feet
    public static double convertYardsToFeet(double yards){
        double feet = yards * 3;
        return feet;
    }

    // to convert from feet to yards
    public static double convertFeetToYards(double feet) {
        double yards = feet / 3;
        return yards;
    }


    // to convert from meters to inches
    public static double convertMetersToInches(double meters) {
        double inches = meters * 39.3701;
        return inches;
    }

    // to convert from inches to meters
    public static double convertInchesToMeters(double inches) {
        double meters = inches * .0254;
        return meters;
    }

    // to convert from inches to centimeters
    public static double convertInchesToCm(double inches) {
        double centimeters = inches * 2.54;
        return centimeters;
    }

    // to convert from centimeters to inches
    public static double convertCmToInches(double centimeters) {
        double inches = centimeters * .3937;
        return inches;
    }

    public static void main(String[] args) {
        System.out.println("10 km to miles: " + convertKmToMiles(10));
        System.out.println("5 miles to km: " + convertMilesToKm(5));
        System.out.println("2 meters to feet: " + convertMetersToFeet(2));
        System.out.println("6 feet to meters: " + convertFeetToMeters(6));
        System.out.println("3 yards to feet: " + convertYardsToFeet(3));
        System.out.println("9 feet to yards: " + convertFeetToYards(9));
        System.out.println("1 meter to inches: " + convertMetersToInches(1));
        System.out.println("12 inches to meters: " + convertInchesToMeters(12));
        System.out.println("10 inches to cm: " + convertInchesToCm(10));
        System.out.println("25 cm to inches: " + convertCmToInches(25));
    }
}
