import java.util.Scanner;

public class CurrencyConvertor {
    public void start() {
        // create a Scanner object to take input
        Scanner input = new Scanner(System.in);
        boolean runAgain = true;

        System.out.println("Welcome to the Currency Convertor program");
        do {
            // take the amount in INR as input
            System.out.print("Enter the amount to convert (INR): ");
            double amount = input.nextDouble();

            if (amount < 0) {
                System.out.println("Invalid amount");
                continue;
            }

            String unit = null;
            System.out.println("\nChoose the Target currency:\n1. USD (United States Dollar)\n2. JPY (Japanese Yen)\n3. GBP (British Pound)");
            double convertedAmount = switch (input.nextInt()) {
                case 1->{
                    unit = "USD";
                    yield amount * 0.011;
                } case 2->{
                    unit = "JPY";
                    yield amount * 1.74;
                } case 3->{
                    unit = "GBP";
                    yield amount * 0.0083;
                } default->{
                    yield -1;
                }
            };

            if (convertedAmount < 0) {
                System.out.println("Invalid input");
                continue;
            }

            System.out.printf( "%.2f INR after coversion are %.2f %s%n",amount,convertedAmount,unit);
            
            System.out.print("Do you want to continue? (Y/n): ");
            input.nextLine();
            String prompt = input.nextLine();
            runAgain = (prompt.length() == 0 || prompt.toUpperCase().charAt(0) != 'N')?true:false;
        } while (runAgain);
        System.out.println("Thankyou for using the program.");
    }
    public static void main(String[] args) {
        CurrencyConvertor app = new CurrencyConvertor();
        app.start();
    } 
}
