public class Calculator{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
       return a+b;
    }
    int add(int x, int y, int z){
        return x+y+z;
    }
    public static void main(String args[]){
        Calculator c = new Calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10.5,20.5));
        System.out.println(c.add(10, 20, 30));
    }
}