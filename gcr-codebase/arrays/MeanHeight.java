import java.util.Scanner;

// to display Mean height of players in a team
public class MeanHeight {
    public static void main(String[] args) {
        // Create the Scanner Object
        Scanner input = new Scanner(System.in);

        int numberOfPlayers = 11;
        double []heights = new double[numberOfPlayers];
        double totalHeight = 0, meanHeight = 0;

        for (int counter = 0; counter < heights.length; counter++) {
            heights[counter] = input.nextDouble();
        }

        for (int counter = 0; counter < heights.length; counter++) {
            totalHeight+=heights[counter];
        }

        meanHeight = totalHeight/numberOfPlayers;

        System.out.println("The mean height is "+ meanHeight);

        // closing the Scanner
        input.close();
    }
}
