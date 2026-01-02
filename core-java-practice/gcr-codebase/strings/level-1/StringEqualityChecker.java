import java.util.Scanner;

// equate strings using different technolues and compare the result
public class StringEqualityChecker {
    // compares two strings by checking each and every character
    public boolean equalsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // compare two strings using built in methods 
    public boolean equals(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        // Create a Scanner and a StringEqualityChecker class object
        Scanner input = new Scanner(System.in);
        StringEqualityChecker object = new StringEqualityChecker();

        String str1 = input.next();
        String str2 = input.next();

        boolean resultWithCharAt = object.equalsUsingCharAt(str1, str2);
        boolean result = object.equals(str1, str2);

        System.out.println("The result with charAt method is " + resultWithCharAt);
        System.out.println("The result with inbuilt method is " + result);

        if (resultWithCharAt == result) {
            System.out.println("Both are equal");
        }

    }
}
