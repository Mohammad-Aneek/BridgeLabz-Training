import java.util.Scanner;

public class VolumeOfCylinder {

    static double getVolume(int radius, int  height){
        final double PI = 3.1417;
        double area_of_base = PI * radius * radius;
        double volume = area_of_base * height;
        return volume;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the radius of the base of cylinder : ");
            int radius = sc.nextInt();

            System.out.print("Enter the height of cylinder : ");
            int height = sc.nextInt();

            double volume = getVolume(radius, height);
            System.out.println("The volume of cylinder is " + volume);
        }
    }
}
