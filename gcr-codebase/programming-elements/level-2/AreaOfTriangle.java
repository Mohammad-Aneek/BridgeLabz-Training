import java.util.Scanner;

public class AreaOfTriangle {

    static double centimeterToInch(double length){
        double lengthInInches = length / 2.54;
        return lengthInInches;
    }

    public static void main(String[] args) {
        // Create the Scanner object 
        Scanner input = new Scanner(System.in);

        // taking the length of base and height of Triangle as input 
        System.out.print("Enter the base and height of Triangle (in cm): ");
        double base = input.nextDouble(), height = input.nextDouble();

        // calculating the area of Triangle
        double areaInCentimeter = base * height / 2, areaInInch = centimeterToInch(base*height)/2;

        // display the data 
        System.out.println("The Area of the triangle in sq in is " + areaInInch + " and sq cm is " + areaInCentimeter);

        input.close();
    }
}
