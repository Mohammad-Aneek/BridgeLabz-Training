import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // age of the person
        int age = input.nextInt();

        // Eligible for voting or not 
        boolean isEligible = age < 18?false:true;
        System.out.println("The person's age is "+age+(isEligible?" and can vote":" and cannot vote"));

        input.close();
    }
}
