import java.util.Scanner;

public class Compare {
    // to compare 2 string lexicographicallly
    public static int compare(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();
        int index = 0;
        while (index < len1 && index < len2) {
            char c1 = str1.charAt(index);
            char c2 = str2.charAt(index);

            if (c1 == c2) {
                index++;
            } else if (c1 < c2) {
                return 1;
            } else {
                return -1;
            }
        }

        if (len1 == len2) {
            return 0;
        } else if (len1 < len2) {
            return 1;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();

        int result = compare(str1,str2);

        if (result == 0) {
            System.out.printf("\"%s\" and \"%s\" are same",str1,str2 );
        } else if (result == 1 ) {
            System.out.printf("\"%s\" comes before \"%s\" in lexicographical order",str1,str2 );
        } else {
            System.out.printf("\"%s\" comes before \"%s\" in lexicographical order",str2,str1 );
        }
    }
}
