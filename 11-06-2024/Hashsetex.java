import java.util.*;

public class Hashsetex {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("HTML");
        hs.add("IBM");
        hs.add("WIPRO");
        hs.add("Infosys");
        System.out.println(hs);
        Iterator<String> i = hs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        hs.remove("WIPRO");
        System.out.println(hs);
    }
    
}
