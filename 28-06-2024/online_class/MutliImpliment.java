class B implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("This is my child thread");
        }
    }
}
public class MutliImpliment {
    public static void main(String[] args) {
        B obj=new B();
        Thread t1=new Thread(obj);
        t1.start();
        for(int i=0;i<5;i++){
            System.out.println("This is my Main thread");
        }

    }
    
}
