class nonaccex{
    public static int a=0;
    public int b=0;
    
    public nonaccex(){
        a++;
        b++;
    }
    public void result(){
        System.out.println("The value of A: "+a);
        System.out.println("The value of B: "+b);

    }
}

public class NonAccess {
    public static void main(String[] args) {
        nonaccex obj1 = new nonaccex();
        System.out.println(obj1.a);
        nonaccex obj2 = new nonaccex();
        System.out.println(obj1.a);
       
        obj2.result();
    }
    
}
