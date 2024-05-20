public class LowerCase{
 public static void main(String[] args){
   char str = 'H';
    if(str>=65 && str<=90){
        System.out.println("upper");
    }
    else if(str>=97 && str<=122){
        System.err.println("lower");
    }
    else{
        System.out.println("invalid");
    }
 }
}
