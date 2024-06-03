// sum of fibonacci series
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        
        int f1=-1,f2=1,f3,limit,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit: ");
        limit=sc.nextInt();
        for(int i=0;i<limit;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            sum=sum+f3;
         System.out.print(f3);
        
        
        
        }
        System.out.println("");
        System.out.println("Sum ="+sum);
         
         
        }
        

        }
    

