import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wildcard {
    public boolean isMatch(String s, String p) {
        String regex = p.replace("?", ".").replace("*", ".*");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Wildcard main = new Wildcard();
        String s = "abcde";
        String p = "a*c?e";
        boolean result = main.isMatch(s, p);
        System.out.println("Is '" + s + "' matching pattern '" + p + "': " + result);
    }
}
