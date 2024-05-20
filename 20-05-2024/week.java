// Write a Java program that takes a number from 1 to 7 and prints the corresponding
// day of the week (1 for Monday, 2 for Tuesday, etc.).
import java.util.Scanner;
public class week {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a number from 1 to 7:");
         int day=scanner.nextInt();

         String dayOfWeek;
         
         switch(day){   
         case 1:
         dayOfWeek="Monday";
         break;
         case 2:
         dayOfWeek="Tuseday";
         break;
         case 3:
         dayOfWeek="Wednesday";
         break;
         case 4:
         dayOfWeek="Thursday";
         break;
         case 5:
         dayOfWeek="Friday";
         break;
         case 6:
         dayOfWeek="Saturday";
         break;
         case 7:
         dayOfWeek="Sunday";
         break;
         default:
         dayOfWeek="Invalid day";
         }
         System.out.println("The day of the week is "+dayOfWeek);
         }
         }





