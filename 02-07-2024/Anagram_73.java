import java.util.Arrays;

public class Anagram_73 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        String s = "eat";
        String t = "tea";
        System.out.println("String 1: " + s);
        System.out.println("String 2: " + t);
        System.out.println("Is anagram: " + isAnagram(s, t));
    }
}