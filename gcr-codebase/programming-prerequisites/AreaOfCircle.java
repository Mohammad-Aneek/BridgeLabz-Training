import java.util.Scanner;

public class AreaOfCircle {
    static double getArea(int radius) {
        final double PI = 3.1417;
        double area = PI * radius * radius;
        return area;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the radius of circle :");
            int radius = sc.nextInt();

            double area = getArea(radius);
            System.out.println("The area of the circle is "+ area);
        }
    }
}
