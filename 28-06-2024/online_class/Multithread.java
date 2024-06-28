
class A extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(+i);
        }
    }
}
class S extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(+i);
        }
    }
}
public class Multithread {
    public static void main(String[] args) {
        A t=new A();
        S s=new S();
        t.start();
        s.start();
    }
    
}