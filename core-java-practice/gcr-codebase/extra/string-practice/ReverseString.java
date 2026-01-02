import java.util.Scanner;

public class ReverseString {
    // to get reverses string using charAt
    public String getReverseString(String str) {
        String reversedString = "";

        for (int i = 0; i < str.length(); i++) {
            reversedString = str.charAt(i) + reversedString;
        }

        return reversedString;
    }
    public static void main(String[] args) {
        // create a Scanner object and ReverseString class object
        Scanner input = new Scanner(System.in);
        ReverseString object = new ReverseString();
        String str = input.next();
        System.out.println("The reverses string is " + object.getReverseString(str));

        // close the input Scanner
        input.close();
    }
}
