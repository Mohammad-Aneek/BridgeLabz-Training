import java.util.Scanner;

// to calculate wind chill temperature
public class ChillTemperature {

    // to calculate wind chill temperature using temperature and wind speed 
    public double calculateWindChill(double temperature, double windSpeed) {
        double chillTemperature = 35.74 + .6215 * temperature + (.4275 * temperature - 35.75) * Math.pow(windSpeed, .16);

        return chillTemperature;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        ChillTemperature object = new ChillTemperature();

        double temperature = input.nextDouble();
        double windSpeed = input.nextDouble();

        // use method to calculate wind chill temperature
        double chillTemperature = object.calculateWindChill(temperature,windSpeed);

        // display the data 
        System.out.println("The wind chill temperature is "+chillTemperature);

        // close the Scanner
        input.close();
    }
}
