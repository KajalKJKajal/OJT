import java.util.ArrayList;
public class lambda {
    public static void main(String[] args) {
      
      ArrayList<Integer> data=new ArrayList<>();
      data.add(3);
      data.add(5);
      data.forEach((n)-> {System.out.println(n);});
      

      
      }
    }