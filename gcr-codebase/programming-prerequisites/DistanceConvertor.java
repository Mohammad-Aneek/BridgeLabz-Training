import java.util.Scanner;

public class DistanceConvertor {
    static double kilometersToMiles(double distance) {
        double converted_distance = distance * 0.621371;
        return converted_distance;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the distance (in kilometers): ");
            double distance = sc.nextDouble();
            
            double converted_distance = kilometersToMiles(distance);

            System.out.println("The distance in miles is " + converted_distance);
        }
    }
}
