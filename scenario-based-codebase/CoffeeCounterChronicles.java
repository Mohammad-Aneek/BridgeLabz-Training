import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        final double GST_RATE = 0.18; // 18%

        while (true) {
            System.out.print("Enter coffee type (espresso/latte/cappuccino) or 'exit' to stop: ");
            String coffeeType = input.next();

            // exit condition
            if (coffeeType.equals("exit")) {
                System.out.println("Service ended. Thank you!\n");
                break;
            }

            double pricePerCup;
            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 120.0;
                    break;
                case "latte":
                    pricePerCup = 150.0;
                    break;
                case "cappuccino":
                    pricePerCup = 140.0;
                    break;
                default:
                    System.out.println("Invalid input");
                    continue; 
            }

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            // Calculate bill
            double subtotal = pricePerCup * quantity;
            double gstAmount = subtotal * GST_RATE;
            double totalWithGst = subtotal + gstAmount;

            // Display bill summary
            System.out.printf("Subtotal: %.2f | GST: %.2f | Total: %.2f\n\n", subtotal, gstAmount, totalWithGst);
        }
        input.close();
    }
}
