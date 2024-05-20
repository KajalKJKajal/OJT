import java.util.Scanner;

public class Absolute {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        System.out.println(Math.abs(num));
    }
}
