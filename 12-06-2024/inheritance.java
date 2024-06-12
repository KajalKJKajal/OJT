class Animal{
     void eat(){
        System.out.println("The animal can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dogs can bark");
    }
}
public class inheritance{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}


