import java.util.Scanner;

public class TemperatureConverter {
    // takes temperature and conversion type as input
    public static double[] takeInput() {
        Scanner input = new Scanner(System.in);
        double[] data = new double[2];
        
        System.out.println("Temperature Conversion");
        System.out.println("1. Fahrenheit to Celcius");
        System.out.println("2. Celcius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        data[0] = input.nextInt();
        
        System.out.print("Enter temperature: ");
        data[1] = input.nextDouble();
        
        input.close();
        return data;
    }

    // converts Fahrenheit to Celsius
    public static double fahrenheitToCelcius(double temp) {
        double converted_temp = (temp - 32) * 5 / 9;
        return converted_temp;
    }

    // converts Celsius to Fahrenheit
    public static double celciusToFarenheit(double temp) {
        double converted_temp = (temp * 9 / 5) + 32;
        return converted_temp;
    }

    public static void main(String[] args) {
        double[] data = takeInput();
        int choice = (int) data[0];
        double temperature = data[1];

        if (choice == 1) {
            double result = fahrenheitToCelcius(temperature);
            System.out.println(temperature + "°F = " + result + "°C");
        } else if (choice == 2) {
            double result = celciusToFarenheit(temperature);
            System.out.println(temperature + "°C = " + result + "°F");
        } else {
            System.out.println("Invalid choice");
        }
    }
}
