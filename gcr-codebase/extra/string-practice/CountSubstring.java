import java.util.Scanner;
public class CountSubstring {
    // to get the count of how many times a string appears in another string
    public static int getCount(String text, String substring) {
        int count = 0;
        int length = text.length();
        int substringLength = substring.length();

        for (int i = 0; i <= length - substringLength; i++) {
            boolean found = true;

            for (int j = 0; j < substringLength; j++) {
                if (text.charAt(i + j) != substring.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        // craete a scanner object
        Scanner input = new Scanner(System.in);

        String text = input.next();
        String substr = input.next();

        System.out.println("The occurences are " + getCount(text,substr) + " times");
        input.close();
    }
}
