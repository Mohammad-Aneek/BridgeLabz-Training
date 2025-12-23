import java.util.Scanner;

public class YoungestTallest {

    public static double getTallest(double[] heights) {
        // finding tallest 
        double tallest = heights[0];
        for (double height : heights) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static int getYoungest(int[] ages) {
        // finding youngest
        int youngest = ages[0];
        for (int age : ages) {
            youngest = Math.min(youngest, age);
        }
        return youngest;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input age and height of Amar, Akbar, and Anthony
        int []ages = new int[3];
        double []heights = new double[3];

        for (int counter = 0; counter < 3; counter++) {
            ages[counter] = input.nextInt();
            heights[counter] = input.nextInt();
        }

        int youngest = getYoungest(ages);
        if ( ages[0] == youngest) {
            System.out.println("Amar is youngest");
        }
        if ( ages[1] == youngest) {
            System.out.println("Akbar is youngest");
        }
        if ( ages[2] == youngest) {
            System.out.println("Anthony is youngest");
        }

        double tallest = getTallest(heights);
        if (heights[0] == tallest) {
            System.out.println("Amar is tallest");
        } 
        if (heights[0] == tallest) {
            System.out.println("Akbar is tallest");
        }
        if (heights[2] == tallest) {
            System.out.println("Anthony is tallest");
        }

        // close the Scanner
        input.close();
    }
}

