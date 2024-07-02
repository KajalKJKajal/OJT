import java.util.*;

public class WordPattern_77 {
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        if (pattern.length() != arr.length)
            return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String s = arr[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(s))
                    return false;
            } else {
                if (map.containsValue(s))
                    return false;
                map.put(c, s);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        WordPattern_77 solution = new WordPattern_77();
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern, str)); // Output: true
    }
}
