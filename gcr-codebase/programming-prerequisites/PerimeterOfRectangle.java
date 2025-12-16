import java.util.Scanner;

public class PerimeterOfRectangle {
    static int getPerimeter(int length, int breadth) {
        int perimeter = length * 2 + breadth * 2;
        return perimeter;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Length of Rectangle: ");
            int length = sc.nextInt();

            System.out.print("Breadth of Rectangle: ");
            int breadth = sc.nextInt();

            int perimeter = getPerimeter(length,breadth);
            System.out.println("Perimeter of Rectangle " + perimeter);
        }
    }
}
