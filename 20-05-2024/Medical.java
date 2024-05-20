import java.util.Scanner;

public class Medical {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you have a medical cause to sit? (Y/N): ");
        String response = scanner.nextLine();

        if (response.equals("Y")) {

            System.out.println("You are allowed to sit due to medical reasons.");
        } else if (response.equals("N")) {
            
            System.out.println("You are not allowed to sit.");
        } 
        

    
    }
}
