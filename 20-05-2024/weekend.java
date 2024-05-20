// Write a Java program that takes a number from 1 to 7 and prints the corresponding
// day of the week (1 for Monday, 2 for Tuesday, etc.).






import java.util.Scanner;
public class weekend{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7:");
        int day = scanner.nextInt();
        String dayofWeek;
        switch (day){
            case 1:
            dayofWeek = "Monday";
            break;
            case 2:
            dayofWeek = "Tuesday";
            break;
            case 3:
            dayofWeek = "Wednesday";
            break;
            case 4:
            dayofWeek = "Thursday";
            break;
            case 5:
            dayofWeek = "Friday";
            break;
            case 6:
            dayofWeek = "Saturday";
            break;
            case 7:
            dayofWeek = "Sunday";
            break;
            default:
            dayofWeek = "Invalid input";
        }
        System.out.println("The corresponding day of the week is " + dayofWeek);
        }
    }



