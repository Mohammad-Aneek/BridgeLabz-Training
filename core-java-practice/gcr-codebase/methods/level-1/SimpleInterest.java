import java.util.Scanner;

// Program to calculate Simple Interest 
public class SimpleInterest {

    // this method uses the principal amount, rate of interst, and time period
    // to calculate simple interest 
    double calculateSimpleInterest(double principal, double rate, double time) {
        double interest = principal * rate * time / 100;
        return interest;
    } 

    public static void main(String[] args) {
        // Create a Scanner object and SimpleInterest object
        Scanner input = new Scanner(System.in);
        SimpleInterest object = new SimpleInterest();

        // taking the principal, rate, and time as input
        double principal = input.nextDouble(), rate = input.nextDouble(), time = input.nextDouble(); 

        // use method to calculate simple interest
        double interest = object.calculateSimpleInterest(principal,rate,time);

        // display result
        System.out.printf(
                "The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f%n",
                interest,
                principal,
                rate,
                time
            );

        // close the Scanner
        input.close();
    }
}
