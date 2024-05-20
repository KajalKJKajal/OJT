import java.util.Scanner;

public class Employee {

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age= scanner.nextInt();

        System.out.println("Are you Male/Female: ");
        String sex= scanner.nextLine();

        if(sex.equals("f")){
            System.out.println("urpan area");
        }
        else if(sex.equals("m")){
        if(age>=20 && age<=40){
         System.out.println("anywhere");
        }
        else if(age>=40 && age<=60){
            System.out.println("urpan area");
        }
        else{
            System.out.println("invalid");
        }
        
    }

    else{
        System.out.println("invalid");
    }
    }
}