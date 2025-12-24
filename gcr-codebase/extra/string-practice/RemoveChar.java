import java.util.Scanner;

public class RemoveChar {
    // to remove a character from a string
    public String getString(String str, char charToRemove) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == charToRemove) {
                continue;
            }
            result += currentChar;
        }

        return result;
    }

    public static void main(String[] args) {
        // create a Scanner object and RemoveChar class object
        Scanner input = new Scanner(System.in);
        RemoveChar object = new RemoveChar();

        String str = input.nextLine();
        char c = input.next().charAt(0);
        System.out.println(object.getString(str,c));
    }
}
