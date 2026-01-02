import java.util.Scanner;

public class SimpleInterestCalculator {

    static double getInterest(int principal, double rate, double time) {
        double simple_interest = principal * rate * time;
        simple_interest /=100;
        return simple_interest;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Principal: ");
            int principal = sc.nextInt();

            System.out.print("Rate: ");
            double rate = sc.nextDouble();

            System.out.print("Time (in years): ");
            double time = sc.nextDouble();

            double simple_interest = getInterest(principal,rate,time);
            System.out.println("The simple interest is " + simple_interest);
        }
    }
}
