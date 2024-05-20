import java.util.Scanner;

public class Attendence {
    public static  void main (String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number of class held: ");
        int classheld=scanner.nextInt();
        System.out.println("Enter the number of class attend: ");
        int classattend=scanner.nextInt();
       double percentage=((double)classattend/classheld)*100;
        if(percentage>75){

            System.out.println("allowed to sit in exam");
            System.out.println(percentage);

        }
        else{
            System.out.println("your will not be allowed to sit in exam");
            System.out.println(percentage);

        }

    }
}
