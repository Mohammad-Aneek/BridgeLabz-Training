import java.util.Scanner;

public class MovieTicketBookingApp {
    private int totalSeat = 100;
    private int seatsBooked = 0;
    private String movieType;
    private String seatType;
    private double ticketCost;
    private String snack;
    private double snackCost;

    private boolean chooseMovie(Scanner input) {
        System.out.println("Select movie type: ");
        System.out.println("1. Action\n2. Sci-fi\n3. Horror\n4. Comedy");
        System.out.print("Enter your choice: ");
        int movieChoice = input.nextInt();

        switch (movieChoice) {
            case 1:
                movieType = "Action";
                break;
            case 2:
                movieType = "Sci-fi";
                break;
            case 3:
                movieType = "Horror";
                break;
            case 4:
                movieType = "Comedy";
                break;
            default:
                System.out.println("Invalid input");
                return true;
        }
        return false;
    }

    private boolean chooseSeat(Scanner input) {
        int seatChoice;
        System.out.println("Choose seat type: ");
        System.out.println("1. Platinum (500)\n2. Gold (350)\n3. Silver (250)\n4. Cancel");
        while(true) {
            System.out.print("Enter your choice: ");
            seatChoice = input.nextInt();
            if (seatChoice == 1) {
                seatType = "Platinum";
                ticketCost = 500;
            } else if (seatChoice == 2) {
                seatType = "Gold";
                ticketCost = 350;
            } else if (seatChoice == 3) {
                seatType = "Silver";
                ticketCost = 250;
            } else if (seatChoice == 4) {
                return true;
            } else {
                System.out.println("Invalid! Try again");
                continue;
            }
            break;
        }
        return false;
    } 

    private boolean chooseSnack(Scanner input) {
        int snackChoice;
        System.out.println("Choose snacks: ");
        System.out.println("1. Popcorn (250)\n2. Soda (100)\n3. Popcorn + Soda Combo (300)\n4. No snacks\n5. Cancel");

        while(true) {
            System.out.print("Enter your choice: ");
            snackChoice = input.nextInt();
            if (snackChoice == 1) {
                snack = "Popcorn";
                snackCost = 250;
            } else if (snackChoice == 2) {
                snack = "Soda";
                snackCost = 100;
            } else if (snackChoice == 3) {
                snack = "Combo";
                snackCost = 300;
            } else if (snackChoice == 4) {
                snack = "No snack";
                snackCost = 0;
            } else if (snackChoice == 5 ) {
                return true;
            } else {
                System.out.println("Invalid! Try again");
                continue;
            }
            break;
        }

        return false;
    }

    private void showTicket(){
        System.out.println("┌─────────────┬──────────┐");
        System.out.println("│ Category    │ Details  │");
        System.out.println("├─────────────┼──────────┤");
        System.out.printf ("│ Movie Genre │ %-8s │\n",movieType);
        System.out.printf ("│ Seat Type   │ %-8s │\n",seatType);
        System.out.printf ("│ Snack       │ %-8s │\n",snack);
        System.out.println("├─────────────┼──────────┤");
        System.out.printf ("│ Ticket cost │ %-8.2f │\n", ticketCost);
        System.out.printf ("│ Snack cost  │ %-8.2f │\n", snackCost);
        System.out.println("├─────────────┼──────────┤");
        System.out.printf ("│ Total Bill  │ %-8.2f │\n", ticketCost + snackCost);
        System.out.println("└─────────────┴──────────┘");
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("Movie Ticket Booking App");

        while (true) {
            boolean tryAgain = false;

            // choose movie type
            tryAgain = chooseMovie(input);
            if (tryAgain) {
                continue;
            }

            // choose seat type 
            tryAgain = chooseSeat(input);
            if (tryAgain) {
                continue;
            }

            // choose snacks
            tryAgain = chooseSnack(input);
            if (tryAgain) {
                continue;
            }

            showTicket();

            System.out.println("Do you want to book another ticket (Y): ");
            if (input.next().charAt(0) != 'Y') {
                break;
            }
        }
        input.close();
    }

    public static void main(String[] args) {
        MovieTicketBookingApp app = new MovieTicketBookingApp();
        app.start();
    }
}
