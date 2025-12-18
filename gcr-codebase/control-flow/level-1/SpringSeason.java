import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // Month and day
        String month = input.next();
        int day = input.nextInt();

        // flag varibales
        boolean isSpring = false;

        switch (month) {
            case "March":
                if (day>=20) {
                    isSpring = true;
                }
                break;
            case "April":
            case "May":
                isSpring = true;
                break;
            case "June":
                if (day <=20) {
                    isSpring = true;
                }
                break;
        }

        // displaying the result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // closing the scanner object
        input.close();
    }
}
