import java.util.ArrayList;
import java.util.HashMap;
public class MyHash {
    public static void main(String[] args) {

      //HashMap 
       HashMap<String,Integer> data=new HashMap<>();

       data.put("A", 2); 
       System.out.println(data.get("A")); 
       System.out.println(data);

        // ArrayList
       ArrayList<Integer> list=new ArrayList<>();
       list.add(2);
       
       System.out.println(list);
 
        // isEmpty
       boolean isempty=data.isEmpty();
       System.out.println(isempty);

  
    
        



    }
    
}
