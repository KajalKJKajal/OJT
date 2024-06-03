import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        int age, income;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your annual income: ");
        income = sc.nextInt();
       
        if (age < 18) {
            System.out.println("You are not eligible for a loan.");
        } else if (age >= 18 && age <= 25 && income >= 2500) {
            System.out.println("You are eligible for a small loan.");
        } else if (age >= 26 && age <= 35 && income >= 50000) {
            System.out.println("You are eligible for a medium loan.");
        } else if (age >= 35  && income >= 750000) {
            System.out.println("You are eligible for a Large36 loan.");
        } else {
            System.out.println("not eligible for a loan.");
        }
    }
}