import java.util.Scanner;



public class string_method{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scanner.nextInt();
        System.out.println("enter the number");
        int a=scanner.nextInt();
        
        String msg = "Hello World";
        String fname="Anu";
        String lname="lekshmi";
        System.out.println("Original String: " + msg);
        System.out.println("Length of the String: " + msg.length());
        System.out.println("Convert in to uppercase: " + msg.toUpperCase());
        System.out.println("Convert in to uppercase: " + msg.toLowerCase());
        System.out.println("Concatinate mathod: " + fname.concat(lname));
    }
}