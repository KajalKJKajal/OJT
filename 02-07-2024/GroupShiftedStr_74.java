import java.util.*;

public class GroupShiftedStr_74 {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            String key = getKey(s);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        map.values().forEach(Collections::sort);
        
        return new ArrayList<>(map.values());
    }
    private String getKey(String s) {
        if (s.length() == 0) return "";
        
        char[] arr = s.toCharArray();
        int diff = arr[0] - 'a';
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            char shifted = (char) (c - diff < 'a' ? c - diff + 26 : c - diff);
            sb.append(shifted);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        GroupShiftedStr_74 solution = new GroupShiftedStr_74();
        String[] strings = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
        List<List<String>> groups = solution.groupStrings(strings);
        groups.forEach(System.out::println);
    }
}
