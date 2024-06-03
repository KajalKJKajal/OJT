import java.util.Scanner;
public class Students {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your mark");
        int mark =sc.nextInt();
        if(mark>=90){
            System.out.println("A");
        }
        else if(mark>=70){
            System.out.println("B");
        }
        else if(mark>=60){
            System.out.println("C");
        }
        else if(mark>=40){
            System.out.println("D");
        }
        else if(mark>=20){
            System.out.println("E");
        }
        
        else{
            System.out.println("Enter correct number");
        }
    }
}
