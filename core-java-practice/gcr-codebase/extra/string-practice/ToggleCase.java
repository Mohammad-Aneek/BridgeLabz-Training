import java.util.Scanner;

public class ToggleCase {
    // to return string with toggled case
    public static String getToggledString(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if ('A' <= c && c <= 'Z') {
                result += (char)(c + ' ');
            } else if ('a' <= c && c <= 'z') {
                result += (char)(c - ' ');
            } else {
                result += c;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // create Scanner object
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(getToggledString(str));
    }
}

