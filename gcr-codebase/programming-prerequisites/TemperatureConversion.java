import java.util.Scanner;

public class TemperatureConversion {

    static double celciusToFarenheit(double temp) {
        double converted_temp = (temp * 9 / 5) + 32;
        return converted_temp;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Temperature (in celcius) : ");
            double temp = sc.nextDouble();

            double converted_temp = celciusToFarenheit(temp);
            System.out.println("The temperature in Farenheit is " + converted_temp);
        }
    }
}
