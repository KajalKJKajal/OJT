import java.util.HashMap;

public class IsomorphicStrings3 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); // true
        System.out.println(isIsomorphic("foo", "bar")); // false
    } 
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i), c2 = t.charAt(i);
            if (mapS.getOrDefault(c1, c2) != c2 || mapT.getOrDefault(c2, c1) != c1) {
                return false;
            }
            mapS.put(c1, c2);
            mapT.put(c2, c1);
        }
        return true;
    }
}
