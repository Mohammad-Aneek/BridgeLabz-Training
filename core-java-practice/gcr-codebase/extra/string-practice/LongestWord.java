import java.util.Scanner;

public class LongestWord {
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

    // to get length of strings
    public static int getLength(String str){
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        } finally {
            return length;
        }
    }

    public static String[][] wordsWithLength(String[] array){
        String[][] arrayWithLength = new String[array.length][2];

        for (int i = 0; i<array.length;i++) {
            arrayWithLength[i][0] = array[i];
            arrayWithLength[i][1] = Integer.toString(getLength(array[i]));
        }

        return arrayWithLength;
    }

    public static int getLongest(String[][] array) {
        int longIndex = 0;
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (Integer.parseInt(array[longIndex][1]) < Integer.parseInt(array[i][1])) {
                longIndex = i;
            }
        }

        return longIndex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().trim();
        String[] words = splitString(text);
        String[][] result = wordsWithLength(words);
        int longest = getLongest(result);
        System.out.println("The longest is " + words[longest]);

    }
}
