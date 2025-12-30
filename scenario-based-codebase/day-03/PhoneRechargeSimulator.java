/* 10. Phone Recharge Simulator 📱
 * Take the user's mobile operator and amount.
 * ● Use a switch to display offers.
 * ● Loop to allow repeated recharges.
 * ● Show balance after each recharge.
 */
import java.util.*;

public class PhoneRechargeSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double walletBalance = 1000.00;
 
        System.out.println("Phone recharge application");
        while (true) {
            System.out.println("Balance: " +  walletBalance);
            
            System.out.println("Select operator: ");
            System.out.println("1. Jio\n2.Airtel\n3. VI\n4. exit");
            System.out.print("Enter Choice: ");
            int choice = input.nextInt();

            if (choice == 4) {
                System.out.println("\nProgram exited");
                break;
            }

            String operator = "";
            switch (choice) {
                case 1 -> { 
                    operator = "Jio";
                    System.out.println("Jio Offers");
                    System.out.println("A. 199 (1.5GB/day)\nB. 499 (Unlimited 5G)");
                } case 2 -> { 
                    operator = "Airtel";
                    System.out.println("Airtel offers");
                    System.out.println("A. 249 (2GB/day)\nB. 599 (Platinum Data)"); 
                } case 3 -> { 
                    operator = "Vi";
                    System.out.println("VI offers");
                    System.out.println("A. 150 (Weekend Rollover)\nB. 350 (Night Unlimited)");
                } default -> { 
                    System.out.println("Invalid Operator!");
                    continue; 
                }
            }

            System.out.print("\nEnter Recharge Amount: ");
            double amount = input.nextDouble();

            // Processing the recharge
            if (amount <= walletBalance) {
                walletBalance -= amount;
                System.out.println("Recharge successful");
                System.out.println("Operator: " +  operator);
                System.out.println("Amount: " + amount);
                System.out.println("New Balance: " + walletBalance);
            } else {
                System.out.println("Isufficient balance");
            }

        }
        input.close();
    }
}
