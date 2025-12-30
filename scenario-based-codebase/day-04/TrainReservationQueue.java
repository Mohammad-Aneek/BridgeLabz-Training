import java.util.Scanner;

public class TrainReservationQueue {
    private int trainCapacity = 10;
    private int seatsBooked = 0;
    private boolean []seats = new boolean[10];
    private String []name = new String[10];

    private void viewSeats() {
        for (int i = 0; i < 5; i++) {
            String status1 = seats[i]?"Occupied":"Vacant";
            String status2 = seats[i+5]?"Occupied":"Vacant";

            System.out.println("┌──────────────────┐       ┌──────────────────┐");
            System.out.printf ("│ Seat Number: %2d  │       │ Seat Number: %2d  │%n",i+1,i+6);
            System.out.printf ("│ Status: %8s │       │ Status: %8s │%n", status1, status2);
            System.out.println("└──────────────────┘       └──────────────────┘");
        }
    }

    public void bookTicket(Scanner input) {
        int seatNumber = -1;
        while (true) {
            System.out.println("Enter the seat number: ");
            seatNumber = input.nextInt() - 1;
            if (seatNumber < 0 || 9 < seatNumber || seats[seatNumber]) {
                System.out.println("Invalid! Try again");
            } else {
                break;
            }
        }
        System.out.println("Enter your name(max 22 char): ");
        name[seatNumber] = input.next();
        if (name[seatNumber].length() > 22) {
            name[seatNumber] = name[seatNumber].substring(0,22);
        }
        seats[seatNumber] = true;
        System.out.println("Ticket booked successfullly");
    }

    public void showTicket(Scanner input) {
        int seatNumber = -1;
        while (true) {
            System.out.println("Enter the seat number: ");
            seatNumber = input.nextInt() - 1;
            if (seatNumber < 0 || 9 < seatNumber || !seats[seatNumber]) {
                System.out.println("Invalid! Try again");
            } else {
                break;
            }
        }

        System.out.println("┌──────────────────────────────────┐");
        System.out.println("│           TRAIN TICKET           │");
        System.out.println("├──────────────────────────────────┤");
        System.out.printf ("│ Name    : %-22s │%n", name[seatNumber]);
        System.out.printf ("│ Seat No : %-22d │%n", seatNumber);
        System.out.println("│                                  │");
        System.out.printf ("│ From    : %-22s │%n", "Life");
        System.out.printf ("│ To      : %-22s │%n", "Death");
        System.out.println("└──────────────────────────────────┘");
        
    }

    public void start(){
        Scanner input = new Scanner(System.in);

        System.out.println("Train Reservation System");
        while (seatsBooked < trainCapacity) {
            System.out.println("Choose an option:");
            System.out.println("1. View Seats\n2. Book ticket\n3. Show Ticket\n4. Exit");
            System.out.println("\nEnter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    viewSeats();
                    break;
                case 2:
                    bookTicket(input);
                    break;
                case 3:
                    showTicket(input);
                    break;
                case 4:
                    System.out.println("Program exit successfull");
                    return;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        }
        input.close();
    }
    public static void main(String[] args) {
        TrainReservationQueue program = new TrainReservationQueue();
        program.start();
    }
}
