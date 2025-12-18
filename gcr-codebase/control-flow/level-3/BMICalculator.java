import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // get the weight and height as input
        double weight = input.nextDouble(), height = input.nextDouble();

        // converting height from cm to m 
        height = height/100;

        // calculate BMI 
        double BMI = weight / (height*height);

        //check the weight status 
        if (BMI <= 18.4) {
            System.out.println("Underweight");
        } else if (18.5 <= BMI && BMI <= 24.9) {
            System.out.println("Normal");
        } else if (25.0 <= BMI && BMI <= 39.9) {
            System.out.println("Overweight");
        } else if (40.0 <= BMI) {
            System.out.println("Obese");
        } else {
            System.out.println("Invalid");
        }

        // close the Scanner
        input.close();
    }
}
