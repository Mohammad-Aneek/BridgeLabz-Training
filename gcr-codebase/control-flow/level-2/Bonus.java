import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input salary and years of service
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();

        //calculate the bonus 
        double bonus = yearsOfService>5?salary*.05:0;

        // display the result 
        System.out.println(bonus);

        // close the Scanner
        input.close();
    }
}
