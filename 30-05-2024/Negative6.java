// Write a program that reads a series of integers from the user and prints the sum
// of the numbers. The program should stop reading numbers when the user enters
// a negative number. Use the break statement to exit the loop.
import java.util.Scanner;
public class Negative6 {

    public static void main(String[] args) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        while (true) {
            int num = scanner.nextInt();
            if (num < 0) {
                continue;
            }
            if (num == 0) {
                break;
            }

           sum=sum+num;
        }
        System.out.println("Sum of a number is="+sum);
 
}
    }
