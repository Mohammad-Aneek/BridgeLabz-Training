import java.util.Scanner;

public class ParkingLotGateSystem {

    private void displayParkingLot(boolean[] parkingLot) {
        for (int i = 0; i < 5; i++) {
            String status1 = parkingLot[i]?"Occupied":"Vacant";
            String status2 = parkingLot[i+5]?"Occupied":"Vacant";

            System.out.println("┌──────────────────┐       ┌──────────────────┐");
            System.out.printf ("│ Lot Number: %2d   │       │ Lot Number: %2d   │%n",i+1,i+6);
            System.out.printf ("│ Status: %8s │       │ Status: %8s │%n", status1, status2);
            System.out.println("└──────────────────┘       └──────────────────┘");
        }
    }

    private void park(boolean[] parkingLot, String[] passKey, Scanner input) {
        System.out.println("Vacant spaces: ");

        // display all the free spaces
        for (int i = 0; i < 10; i++) {
            if (!parkingLot[i]) {
                System.out.printf("Lot number %2d is free.\n",i+1);
            }
        }

        // choosing the space
        int choice;
        while (true) {
            System.out.println("\nEnter your choice (-1 to cancel): ");
            choice = input.nextInt() - 1;

            if (choice >= 10 || choice < 0 || parkingLot[choice]) {
                System.out.println("Invalid input! Try again.");
                continue;
            }
            break;
        }

        // creating the passkey
        String securityKey;
        while(true) {
            System.out.print("Enter a passKey(type exit to return): ");
            securityKey = input.next();

            if (securityKey.length() == 0) {
                System.out.println("PassKey needed! try again");
            } else if (securityKey.toLowerCase().equals("exit")) {
                System.out.println("Process cancelled");
                break;
            }else {
                parkingLot[choice] = true;
                passKey[choice] = securityKey;
                break;
            }
        }
    }

    void retrieve(boolean[] parkingLot, String[] passKey, Scanner input) {
        System.out.println("Occupied spaces: ");
        
        // display all the Occupied spaces
        for (int i = 0; i < 10; i++) {
            if (parkingLot[i]) {
                System.out.printf("Lot number %2d is Occupied.\n",i+1);
            }
        }

        // choosing the space
        int choice;
        while (true) {
            System.out.println("\nEnter your choice (-1 to cancel): ");
            choice = input.nextInt() - 1;

            if (choice >= 10 || choice < 0 || !parkingLot[choice]) {
                System.out.println("Invalid input! Try again.");
                continue;
            }
            break;
        }

        // verify with passkey
        String securityKey;
        while(true) {
            System.out.print("Enter passKey (type exit to return): ");
            securityKey = input.next();

            if (passKey[choice].equals(securityKey)) {
                passKey[choice] = "";
                parkingLot[choice] = false;
                System.out.println("Retrieval Successful.");
                break;
            } else if (securityKey.toLowerCase().equals("exit")) {
                System.out.println("Process cancelled");
                break;
            }else {
                System.out.println("Wrong passKey! Try again");
            }
        }
    }

    void start() {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        boolean[] parkingLot = new boolean[10];
        String[] passKey = new String[10];

        System.out.println("Welcome to Parking Lot system.");
        while (true) {
            displayParkingLot(parkingLot);
            System.out.println("Choose an option:");
            System.out.println("1. Park\n2. Retrieve\n3. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    park(parkingLot, passKey, input);
                    break;
                case 2:
                    retrieve(parkingLot,passKey, input);
                    break;
                case 3:
                    System.out.println("Thank you for using the service.");
                    return;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ParkingLotGateSystem parkingLot = new ParkingLotGateSystem();
        parkingLot.start();
    }
}
