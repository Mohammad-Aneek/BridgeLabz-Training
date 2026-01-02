import java.util.Scanner;

public class StringSplit {
    // to count the number of words in string
    public static int countWords(String text) {
        boolean isWord = false;
        int count = 0;

        for (int i=0; i<text.length();i++) {
            char c = text.charAt(i);
            if (c == ' ' && isWord) {
                isWord = false;
            } else if (c != ' ' && !isWord) {
                isWord = true;
                count++;
            }
        }

        return count;
    }

    // to get position of all spaces in string
    public static int[] getSpaces(String text) {
        int spaces[] = new int[countWords(text)];
        spaces[0] = -1;
        int index = 1;
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaces[index] = i;
                index++;
            }
        }
        return spaces;
    }

    // to split string into array of words
    public static String[] splitString(String text) {
        int[] spaces = getSpaces(text);
        int countOfWords = spaces.length;
        String []words = new String[countOfWords];

        for (int i = 0; i < countOfWords - 1; i++) {
            words[i] = text.substring(spaces[i]+1,spaces[i+1]);
        }

        words[countOfWords-1] = text.substring(spaces[countOfWords-1] + 1);

        return words;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().trim();
        String []words = splitString(text);

        for (String word : words) {
            System.out.print(word + ", ");
        }
    }
}
