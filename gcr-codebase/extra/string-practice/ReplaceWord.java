import java.util.Scanner;

public class ReplaceWord {
    // to replace a word with another in a string
    public String getString(String str, String word1, String word2) {
        String result = "";
        int i = 0;
        while ( i <= str.length() - word1.length()) {
            boolean found = true;
            int j = 0;
            while (j < word1.length()) {
                if (str.charAt(i+j) != word1.charAt(j)) {
                    found = false;
                    break;
                }
                j++;
            }

            if (found) {
                result += word2;
                i += j;
                continue;
            } else {
                result += str.charAt(i);
                i++;
            }
        }

        while (i < str.length()) {
            result += str.charAt(i);
            i++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        // create a Scanner object and RemoveChar class object
        Scanner input = new Scanner(System.in);
        ReplaceWord object = new ReplaceWord();

        String str = input.nextLine();
        String word1 = input.next(), word2 = input.next();
        System.out.println(object.getString(str,word1,word2));
    }
}
