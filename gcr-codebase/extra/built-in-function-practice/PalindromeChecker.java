import java.util.Scanner;

public class PalindromeChecker {
    // takes a string as input
    public static String takeInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        input.close();
        return text;
    }

    // checks if the string is a palindrome using two pointers
    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // displays the result
    public static void displayResult(String text, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + text + "\" is a palindrome");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome");
        }
    }

    public static void main(String[] args) {
        String text = takeInput();
        boolean result = isPalindrome(text);
        displayResult(text, result);
    }
}
