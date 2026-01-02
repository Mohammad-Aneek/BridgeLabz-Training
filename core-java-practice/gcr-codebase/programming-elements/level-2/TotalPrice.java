import java.util.Scanner;

// To calculate total price using unit price and quantity
public class TotalPrice {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // unit price of an item 
        System.out.println("The price per item: ");
        int unitPrice = input.nextInt();

        // quantity to be bought
        System.out.println("The quantity of items: ");
        int quantity = input.nextInt();

        // calculate and store total price
        int totalPrice = unitPrice * quantity;

        // display data 
        System.out.printf("The total purchase price is INR %d if the quantity is %d and unit price is INR %d",totalPrice,quantity,unitPrice );

        input.close();
    }
}
