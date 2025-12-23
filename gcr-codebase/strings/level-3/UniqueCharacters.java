import java.util.Scanner;

public class UniqueCharacters {
    // to get length of string using looping and error handling
    public int getLength(String str){
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

    // to get Unique Characters
    public char[] getUnique(String str){
        int length = getLength(str);
        char[] array = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                array[index++] = str.charAt(i); 
            }
        }

        char[] uniqueChars = new char[index];
        for (int i = 0; i < index; i++) {
            uniqueChars[i]=array[i];
        }
        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UniqueCharacters object = new UniqueCharacters();

        String text = input.nextLine();

        char[] uniqueChars = object.getUnique(text);

        for (char c : uniqueChars) {
            System.out.print(c+" ");
        }
    }
}
