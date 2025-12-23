import java.util.Scanner;

public class Frequency { 
    // to get frequency 
    public static String[][] getFrequency(String text) {
        int[] frequency = new int[256];
        int chars = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (frequency[c] == 0) {
                chars++;
            }
            frequency[c]++;
        }

        int index = 0;
        String [][]fixedFrequency = new String[chars][2];
        for (int i = 0; i < 256; i++) {
            if (frequency[i] != 0) {
                fixedFrequency[index][0] = (char)i + "";
                fixedFrequency[index][1] = Integer.toString(frequency[i]);
                index++;
            }
        }
        return fixedFrequency;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.next();
        String [][]frequency = getFrequency(text);
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + " " + frequency[i][1]);
        }
    }
}
