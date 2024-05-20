import java.util.Scanner;

public class BounsCalculator{
    public static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your salary : ");
        int salary=scanner.nextInt();
        System.out.println("Enter your year of experience: ");
        int year=scanner.nextInt();
        if(year>5){
            double bonus=0.05 * salary;
            System.out.println("You are eligible for the " +bonus);
        }
        else{
            System.out.println("Not eligible");
        }

    }
}