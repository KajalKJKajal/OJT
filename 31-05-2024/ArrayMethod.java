import java.util.Arrays;
public class ArrayMethod {
   public static void main(String[] args) {
    int [] num={1,2,4,5,12,3};
    for(int i:num){
        System.out.println(i);
    }


    // System.out.print(Arrays.sort(num));
    for(int i:num){
        System.out.println(i);
    }
System.out.println(Arrays.toString(num));
int [] copy=Arrays.copyOf(num,num.length);
System.out.println(Arrays.toString(copy));
System.out.println(num.length);
    

    System.out.println(Arrays.binarySearch(num,2));
   
    System.out.println(Arrays.equals(num, copy));



   }

}
