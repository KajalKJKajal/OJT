// package ExceptionHandling;
// import java.util.Scanner;

// class program{
//     int num1,num2,res;
//     public void calculate(){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the two values for num1 num2 num3:");
//     num1=sc.nextInt();
//     num2=sc.nextInt();
//     try{
//     res=num1/num2;
//     System.out.println("The result is:"+res);
//     }
//     catch(ArithmeticException e){
//         System.out.println("An error occured");
//         System.out.println("Error message"+e);

//     }
//     finally{
//         System.out.println("Finally block executed");
//     }
// }

// public class ExceptionEx {
//     public static void main(String[] args) {
//         program obj=new program();
//         obj.calculate();

//     }

    
// }}


package ExceptionHandling;
import java.util.Scanner;

class Program {
    int num1, num2, res;
    
    public void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for num1 and num2:");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        res = num1 / num2;
            System.out.println("The result is: " + res);
            
            System.out.println("Finally block executed after exception");

        
    }
}
public class ExceptionEx {
    public static void main(String[] args) {
        Program obj = new Program();
        obj.calculate();
    }
}

