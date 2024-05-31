public class method {
    public void add(int a)
    {
        System.out.println(4+a);
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        method m = new method();
        m.add(10);
        m.add(2,5);
    }
    
}
