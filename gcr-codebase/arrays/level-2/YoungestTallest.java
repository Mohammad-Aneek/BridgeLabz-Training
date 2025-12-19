import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input age and height of Amar, Akbar, and Anthony
        int []age = new int[3];
        double []height = new double[3];

        for (int counter = 0; counter < 3; counter++) {
            age[counter] = input.nextInt();
            height[counter] = input.nextInt();
        }

        // finding youngest
        int youngest = age[0];
        for (int element : age) {
            youngest = Math.min(youngest, element);
        }


        if ( age[0] == youngest) {
            System.out.println("Amar is youngest");
        }
        if ( age[1] == youngest) {
            System.out.println("Akbar is youngest");
        }
        if ( age[2] == youngest) {
            System.out.println("Anthony is youngest");
        }

        // finding tallest 
        double tallest = height[0];
        for (double element : height) {
            tallest = Math.max(tallest, element);
        }

        if (height[0] == tallest) {
            System.out.println("Amar is tallest");
        } 
        if (height[0] == tallest) {
            System.out.println("Akbar is tallest");
        }
        if (height[2] == tallest) {
            System.out.println("Anthony is tallest");
        }

        // close the Scanner
        input.close();
    }
}

