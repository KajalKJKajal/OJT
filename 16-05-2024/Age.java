import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first age: ");
        int age1=scanner.nextInt();
        System.out.println("Enter the Second age: ");
        int age2=scanner.nextInt();
        System.out.println("Enter the Third age: ");
        int age3=scanner.nextInt();
        if(age1>age2 && age1>age3){
            System.out.println("Oldest age is :"+age1);
        }
        else if (age2>age1 && age2>age3){
            System.out.println("Oldest age is :"+age2);

        }
else{
            System.out.println("Oldest age is :"+age3);
        }
    }
}
