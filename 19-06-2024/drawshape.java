class Shape{
    void draw(){
        System.out.println("Drawing a Shape");
    }
}
class circle extends Shape{
    @Override
    void draw(){

        System.out.println("Drawing circle");
    }
}
class rectangle extends Shape{
    @Override
    void  draw(){
        System.out.println("Drawing rectangle");
    }
}
public class drawshape {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        Shape Circle = new circle();
        Circle.draw();
        Shape Rectangle = new rectangle();
        Rectangle.draw();

    }
}