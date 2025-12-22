import java.util.Scanner;
public class VowelsAndConsonants {
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

    // to get the count of vowels and consonants
    public static int[] getCount(String text) {
        int vowels = 0, consonants = 0;

        for (int i=0; i < text.length(); i++) {
            char c = text.charAt(i);
            String result = VowelsAndConsonants.isWhat(c);
            if (result == "Vowel") {
                vowels++;
            } else if (result == "Consonant") {
                consonants++;
            }
        }

        return new int[]{vowels,consonants};
    }

    public static void main(String[] args) {
        // create a Scanner object
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        int[] result = getCount(text);

        System.out.println("Vowels " + result[0]);
        System.out.println("Consonants " + result[1]);

        // close the Scanner object
        input.close();
    }
}
