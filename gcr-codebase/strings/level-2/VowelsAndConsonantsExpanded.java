import java.util.Scanner;
public class VowelsAndConsonantsExpanded {
    // to check if a character is vowel or consonant
    public static String isWhat(char c){
        if ('A' <= c && c <= 'Z') {
            c = (char)(c + ' ');
        }

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        if ('a' <= c && c <= 'z') {
            for (char vowel: vowels) {
                if (vowel == c) {
                    return "Vowel";
                }
            }
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static int getCharacterCount(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ('A' < c && c < 'Z' || 'a' < c && c < 'z' ) {
                count++;
            }
        }

        return count;
    }

    // to get the count of vowels and consonants
    public static String[][] getStatus(String text) {
        int characterCount = getCharacterCount(text);
        String[][] array = new String[characterCount][2];

        int index = 0;
        for (int i=0; i < text.length(); i++) {
            char c = text.charAt(i);
            String result = VowelsAndConsonants.isWhat(c);
            if (result == "Vowel" || result == "Consonant") {
                array[index][0] = Character.toString(c);
                array[index][1] = result;
                index++;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        // create a Scanner object
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        String[][] result = getStatus(text);

        System.out.printf("| %9s | %9s |%n", "Character", "Status");
        System.out.println("-------------------------");
        for (String[] charAndStatus : result) {
            System.out.printf("| %9s | %9s |%n",charAndStatus[0],charAndStatus[1]);
        }

        // close the Scanner object
        input.close();
    }
}
