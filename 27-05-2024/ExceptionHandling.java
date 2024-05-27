public class ExceptionHandling {
    public static void main(String[] args) {
       
        try{
        int n=10/0;
        System.out.println("Result is "+n);
        }
        catch(Exception e){
            System.out.println("error");
        }
        // finally{
        //     System.out.println("close");
        // }

        System.out.println("program executed");
    }
    
}
