import java.util.Scanner;
public class Multiplication {
   
public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.err.println("enter the number");
    int a=scanner.nextInt();
    int b;

    for( b=1; b<=10 ; b++){
       int c=b*a;
       System.out.println( b + "*"+ a +"=" + c);
    }
   
}
}
