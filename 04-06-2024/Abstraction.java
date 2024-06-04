abstract class car{
    car(){
        System.out.println("Owner is John ");
    }
    abstract void brandName();
    public void color(){
        System.out.println("Color is Red");
    }
    
}
class car1 extends car{
    public void brandName(){
        System.out.println("Brand Name is Toyota");
    }
}
class car2 extends car{
    public void brandName(){
        
        System.out.println("Brand Name is Honda");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        car obj=new car1();
        obj.brandName();
        obj.color();
        car obj2=new car2();
        obj2.brandName();
        obj2.color();
    }
    
}
