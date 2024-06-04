class example{
    public void display(){
        System.out.println("Method without parameter");
    }
    public void display(int a){
        System.out.println("Method with one parameter");
    }
    public void display(int a, int b){
        System.out.println("Method with two parameters"+a+","+b);
    }
    public void display(double a, double b){
        System.out.println("Method with two double parameters"+a+","+b);
    }
    public void display(double x,int y,String z){
        System.out.println("Method with three parameters"+x+","+y+","+z);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        example e = new example();
        e.display(2);
        e.display(2,3);
        e.display(2.5,3.5);
        e.display(2.5,3,"Hello");

    }
    
}
