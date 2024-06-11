interface shape
{
    double calarea();
}
class rectangle implements shape{
    public double length;
    public double width;
    public rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public double calarea(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
    }

 
public class interfaces{
    public static void main(String[] args){
        rectangle rec = new rectangle(10,5);
        System.out.println("Area of a rectangle:"+rec.calarea());
        System.out.println("Perimeter of a rectangle:"+rec.perimeter());
    }
}