import java.util.Scanner;
public class RemoveDuplicates {
    // to get string after removing duplicate strings
    public String getUnique(String str) {
        boolean []found = new boolean[256];
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (found[c]) {
                continue;
            }
            found[c] = true;
            result += c;
        }

        return result;
    }
    public static void main(String[] args) {
        // create a Scanner object
        Scanner input = new Scanner(System.in);
        RemoveDuplicates object = new RemoveDuplicates();

        String str = input.next();
        System.out.println("The modified string is " + object.getUnique(str));

        // close the Scanner
        input.close();
    }
}
