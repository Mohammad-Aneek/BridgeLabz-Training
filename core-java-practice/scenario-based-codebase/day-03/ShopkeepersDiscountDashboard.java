/* 8. Shopkeeper’s Discount Dashboard 🛍️
 * A shopkeeper gives discounts based on total bill:
 * ● Input item prices in a for-loop.
 * ● Use if-else for discount logic.
 * ● Use proper indentation, constants, and comments.
*/

import java.util.*;

public class ShopkeeperDiscountDashboard {
    // name <-> price <-> quantity
    private String [][]products;

    // quantity
    private int[] cart;

    public ShopkeeperDiscountDashboard() {
        products =new String[][]{
            {"Milk (1L)", "2.79", "45"}, 
            {"Bread (Loaf)", "2.99", "30"},
            {"Eggs (Dozen)", "3.79", "25"},
            {"Rice (1kg)", "3.50", "100"},
            {"Sugar (1kg)", "1.80", "60"},
            {"Butter (250g)", "4.50", "20"},
            {"Coffee (200g)", "8.99", "15"},
            {"Tea Bags (50s)", "4.25", "40"},
            {"Cooking Oil (1L)", "5.40", "35"},
            {"Pasta (500g)", "1.99", "50"},
            {"Apples (1kg)", "6.17", "28"},
            {"Oranges (1kg)", "5.06", "22"},
            {"Chocolate Bar", "2.10", "80"}
        };

        cart = new int[13];
    }

    public void showCatalog() {
        System.out.println("┌────┬─────────────────────┬─────────┬───────┐");
        System.out.printf("│ %2s │ %19s │ %7s │ %5s │\n", "ID" ,"Product", "price", "stock");
        for ( int i = 0; i < products.length; i++) {
            System.out.println("├────┼─────────────────────┼─────────┼───────┤");
            System.out.printf("│ %-2d │ %-19s │ %7s │ %5s │\n",i + 1,products[i][0],products[i][1],products[i][2]);
        }
        System.out.println("└────┴─────────────────────┴─────────┴───────┘");
    }

    private void addToCart(Scanner input) {
        System.out.print("Enter the Product ID (-1 to exit): ");
        int id = input.nextInt() - 1;

        if (id == -1) {
            System.out.println("Purchase cancelled");
            return;
        } else if (id < 0 || 12 < id) {
            System.out.println("Invalid ID");
            return;
        } else if (Integer.valueOf(products[id][2]) == 0) {
            System.out.println("Product out of stock");
            return;
        }

        while (true) {
            System.out.print("Enter the quantity (-1 to exit): ");
            int quantity = input.nextInt();

            if (quantity == -1) {
                System.out.println("Purchase cancelled");
                return;
            }else if (quantity > Integer.valueOf(products[id][2])) {
                System.out.printf("Not enough stock! only %s units left. Please choose different amount\n",products[id][2]);
                continue;
            }
            cart[id] += quantity;
            products[id][2] = "" + (Integer.valueOf(products[id][2]) - quantity);
            break;
        }
    }

    public void viewCart() {
        double billAmount = 0;
        System.out.println("┌────┬─────────────────────┬─────────┬──────────┬──────────┐");
        System.out.printf("│ %2s │ %19s │ %7s │ %8s │ %8s │\n", "ID" ,"Product", "Price", "Quantity", "Total");
        for ( int i = 0; i < products.length; i++) {
            if (cart[i] == 0) {
                continue;
            }

            double total = Integer.valueOf(cart[i]) * Double.valueOf(products[i][1]);
            billAmount += total;

            System.out.println("├────┼─────────────────────┼─────────┼──────────┼──────────┤");
            System.out.printf("│ %-2d │ %-19s │ %7s │ %8s │ %8s │\n", i+1, products[i][0], products[i][1], cart[i], total);
        }
        System.out.println("├────┴─────────────────────┴─────────┴──────────┴──────────┤");
        System.out.printf ("│                          Total bill amount: %12.2f │\n",billAmount);
        if (billAmount >= 500) {
            System.out.println("├──────────────────────────────────────────────────────────┤");
            System.out.printf ("│                            Discount amount: %12.2f │\n", 25.0);
            System.out.println("├──────────────────────────────────────────────────────────┤");
            System.out.printf ("│                          Final bill amount: %12.2f │\n",billAmount - 25);
        } else if (billAmount > 150) {
            System.out.println("├──────────────────────────────────────────────────────────┤");
            System.out.printf ("│                            Discount amount: %12.2f │\n",billAmount * .05);
            System.out.println("├──────────────────────────────────────────────────────────┤");
            System.out.printf ("│                          Final bill amount: %12.2f │\n",billAmount * .95);
        } else if (billAmount > 50) {
            System.out.println("├──────────────────────────────────────────────────────────┤");
            System.out.printf ("│                            Discount amount: %12.2f │\n", billAmount * .02);
            System.out.println("├──────────────────────────────────────────────────────────┤");
            System.out.printf ("│                          Final bill amount: %12.2f │\n",billAmount * .98);
        }
        System.out.println("└──────────────────────────────────────────────────────────┘");
    }

    public void generateBill() {
        double billAmount = 0;
    }

    public void startDashboard() {
        // create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Dashboard");

        while (true) {
            System.out.println("\nChoose an option: ");
            System.out.println("\n1. View Catalog\n2. Add product\n3. Generate Bill\n4. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    showCatalog();
                    break;
                case 2:
                    addToCart(input);
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    System.out.println("Thank you for using");
                    return;
                default:
                    break;
            }
        }

    }
    public static void main(String[] args) {
        ShopkeeperDiscountDashboard object = new ShopkeeperDiscountDashboard();
        object.startDashboard();
    }
}
