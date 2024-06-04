
class rectangle{
    int length,breadth,area;
    rectangle(){
        System.out.println("----Calculating the area of rectangle-----");
        
    }
    public void calarea(int length,int breadth){
        area=length*breadth;
        System.out.println("the area of the rectangle is"+area);
    }
}
public class ConstructorEx {
    public static void main(String[] args) {
        rectangle rec=new rectangle();
        rec.calarea(10,23);
    }
        
    }