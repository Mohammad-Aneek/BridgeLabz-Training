import java.util.Scanner;

public class MetroSmartCardFareDeduction {
    private double cardBalance;

    public MetroSmartCardFareDeduction(int cardBalance) {
        this.cardBalance = cardBalance;
    }

    public void travel(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Delhi Metro Smart Card System.");

        while(true) {
            if (cardBalance < 11) {
                System.out.println("Cannot travel. Balance too low");
                break;
            }

            System.out.printf("Current Balance is %.2f%n",cardBalance);
            System.out.println("For platform ticket enter 0.");
            System.out.print("Enter distance in km for your ride (-1 to exit): ");
            double distance = input.nextDouble();

            if (distance < 0) {
                System.out.println("Program Exited");
                break;
            }

            double fare = getFare(distance);
            if (fare > cardBalance) {
                System.out.println(fare);
                System.out.printf(
                        "Not enough balance to travel distance of %.2f km%n",
                        distance
                );
                continue;
            }

            cardBalance -=fare;
            System.out.printf("The fare for %.2f km is %.2f%n",distance,fare);
        }
    }

    private double getFare(double distance) {
        double fare = distance < 2 ? 11 : (distance < 5 ? 21 : (distance < 12 ? 32 : (distance < 21 ? 43 : (distance < 32 ? 54 : 64))));

        return fare;
    }
    public static void main(String[] args) {
        MetroSmartCardFareDeduction object = new MetroSmartCardFareDeduction(200);

        object.travel();
    }
}
