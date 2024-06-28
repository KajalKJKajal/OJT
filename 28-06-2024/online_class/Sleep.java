public class Sleep {
    public static void main(String[] args) {
        D t=new D();
        t.start();
        for(int i=0;i<5;i++){
            try{
            System.out.println("I love to Study ");
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Main thread  was interrupted"+e.getMessage());
        }
    }
    }
}
class D extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
            System.out.println("NSTI");
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Thread D was interrupted"+e.getMessage());
        }
    }
}
}
