import java.util.Scanner;

public class ExtraUnitConvertor {

    private ExtraUnitConvertor() {}

    // to convert farhenheit to celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double celsius = (farhenheit - 32) * 5 / 9;
        return celsius;
    }

    // to convert celsius to farhenheit
    public static double convertCelsiusToFarenheit(double celsius) {
        double farhenheit = (celsius * 9 / 5) + 32;
        return farhenheit;
    }

    // to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double kilograms = pounds * .453592;
        return kilograms;
    }

    // to convert kilograms to pounds
    public static double covertKilogramsToPounds(double kilograms) {
        double pounds = kilograms * 2.20462;
        return pounds;
    }

    // to convert gallons to liters
    public static double conertGallonsToLiters(double gallons) {
        double liters = gallons * 3.78541;
        return liters;
    }

    // to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double gallons = liters * .264172;
        return gallons;
    }
    
    public static void main(String[] args) {
        System.out.println("32°F to Celsius = " + convertFarhenheitToCelsius(32));
        System.out.println("100°C to Fahrenheit = " + convertCelsiusToFarenheit(100));

        System.out.println("150 pounds to kilograms = " + convertPoundsToKilograms(150));
        System.out.println("70 kilograms to pounds = " + covertKilogramsToPounds(70));

        System.out.println("5 gallons to liters = " + conertGallonsToLiters(5));
        System.out.println("3 liters to gallons = " + convertLitersToGallons(3));
    }
}
