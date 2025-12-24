import java.util.Scanner;

public class MostFrequent {
    // to get the most frequent chat in a string
    public static char getMostFrequentCharacter(String str) {
        int []frequency = new int[256];
        char mostFrequentChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequency[c]++;
            if (frequency[c] > frequency[mostFrequentChar]) {
                mostFrequentChar = c;
            }
        }

        return mostFrequentChar;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().trim();
        System.out.println("Most frequent char is " + getMostFrequentCharacter(text));
    }
}
