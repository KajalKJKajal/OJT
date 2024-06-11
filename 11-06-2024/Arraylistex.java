import java.util.*;
public class Arraylistex {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Kajal");
        al.add("Anu");
        al.add("Aparna");
        al.add("Ahlaya");
        al.add("Sarjitha");
        System.out.println("The list of elements is:"+al.get(2));

        for(String course:al){
            System.out.println(course);
        }
        System.out.println(al);
        System.out.println("------------");
        Iterator<String> itr =al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
