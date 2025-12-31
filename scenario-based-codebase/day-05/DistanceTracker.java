import java.util.Scanner;

public class DistanceTracker {
    private double randomDistance() {
        return Math.random() * 7;
    }
    public void start() {
        Scanner input = new Scanner(System.in);
        double totalDistance = 0;
        while (true){
            double distance = randomDistance();
            System.out.printf("The next stop is %.2f kms. Do you want to travel? (Y/n): ",distance);
            char choice = input.next().toUpperCase().charAt(0);

            if (choice == 'N') {
                System.out.printf("%nYou travelled a total of %.2f kms%n", totalDistance);
                break;
            } else {
                totalDistance+=distance;
                System.out.printf("%nYou travelled %.2f kms safely.%n", totalDistance);
            }
        }
    }
    public static void main(String[] args) {
        DistanceTracker app = new DistanceTracker();
        app.start();
    }
}
