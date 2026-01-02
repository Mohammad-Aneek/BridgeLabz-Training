import java.util.Scanner;

// to calculte the discount amount and discounted university fee
public class DiscountWithInput {
    public static void main(String[] args) {
        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // get university fee as input 
        System.out.print("Enter the college fee: ");
        int fee = sc.nextInt();

        // get discount percent as input
        System.out.print("Enter the discount percent: ");
        double discountPercentage = sc.nextDouble();

        // calculte and store the discount amount
        double discountAmount = fee * discountPercentage / 100;

        // calculte and store the discounted price 
        double discountedFee = fee - discountAmount;

        // display the data
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR "+discountedFee);
    }
}
