import java.util.Scanner;

// to take age of 10 students and check their voting eligibility
public class VotingEligibility {
    public static void main(String[] args) {
        // Create the Scanner Object
        Scanner input = new Scanner(System.in);

        // Array of length 10
        int[] arrayOfAge = new int[10];

        // getting the ages as input
        for (int index = 0; index < arrayOfAge.length; index++) {
            arrayOfAge[index] = input.nextInt(); 
        }

        // checking the ages for eligibility
        for (int index = 0; index < arrayOfAge.length; index++) {
            if (arrayOfAge[index] < 0) {
                System.out.println("Invalid age");
            } else if (arrayOfAge[index] >= 18) {
                System.out.println("The student with the age "+arrayOfAge[index]+" can vote");
            } else {
                System.out.println("The students with the age "+arrayOfAge[index]+"can not vote");
            }
        }

        // closing the Scanner
        input.close();
    }
}
