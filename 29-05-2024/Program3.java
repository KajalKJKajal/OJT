import java.util.Arrays;
import java.util.Scanner;
public class a {

    public static void main(String[] args) {
        String c=" ";
        Scanner sc=new Scanner(System.in);
        System.err.println();
        String n=sc.nextLine();
        char[] ch=n.toCharArray();
        for (int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(ch));
        System.out.println(n.charAt(4));
        System.out.println("__________________________________________");
        while (sc.hasNext()) {
        String s1=sc.next();
    c +=  Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ";
    
}
System.err.println(c.trim());

    }
}