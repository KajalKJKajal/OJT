class Shape{ //Parent class,superclass,base
    int length,area;//property
    public void show(){
        System.out.println("Length is "+length);
        System.out.println("Area is "+area);
    }
}

class sqaure extends Shape{//child class
    sqaure(int s){
      this.length=s;
    }
    public void show(){
        area=length*length;
        System.out.println("Area :"+area);
    }
   
}
class rectangle extends Shape{
    int breadth;
    rectangle(int l,int b){
    length=l;
    breadth=b;
    }
    public void show(){
        area=length*breadth;
        System.out.println("Area :"+area);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        sqaure obj=new sqaure(5);
        obj.show();
        rectangle obj1=new rectangle(4,6);
        obj1.show();
    }
}
