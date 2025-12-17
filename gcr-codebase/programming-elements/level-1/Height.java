import java.util.Scanner;

// To convert height from cms to feets & inches
public class Height {
    public static void main(String[] args) {
        // Creating the Scanner object
        Scanner sc = new Scanner(System.in);

        // taking the height as input
        System.out.print("Enter the height (in centimeters): ");
        double heightInCentimeters = sc.nextDouble();

        // convert height from Centimeters to inches
        double heightInInches = heightInCentimeters/2.54;

        // calculating as feets and inches
        int feet = (int)heightInInches / 12;
        double remaingInches = heightInInches % 12;

        // display data 
        System.out.println("Your height in centimeters is " + heightInCentimeters + " while in feet is " + feet + (remaingInches==0?"":(" and inches is "+remaingInches)));

        // closing the Scanner
        sc.close();
    }
}
