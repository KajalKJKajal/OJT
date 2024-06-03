public class NestedIf {
    public static void main(String[] args) {
        int x=30;
        int y=60;
        if(x>20){
            System.out.println("The  x is greater than 20");
            if(y>5){
                System.out.println("The y is greater than 5");
            }
            else{
                System.out.println("Y is not greater the 5");
            }
        }
        else{
            System.out.println("x is not greater the 20");
        }
    }
    
}
