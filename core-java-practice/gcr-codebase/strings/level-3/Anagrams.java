public class Anagrams {
    public boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int []frequency = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i)]++;
            frequency[str2.charAt(i)]--;
        }

        for (int freq : frequency) {
            if (freq != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Anagrams object = new Anagrams();
        boolean result = object.areAnagram("Hello","eHlol"); 
        System.out.println(result);
    }
}
