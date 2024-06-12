class Livingbeing{
    void being(){
        System.out.println("I am LivingBeing");
    }
}
class Animal extends  Livingbeing{
    void ani1(){
        System.out.println("I am an Animal");
    }
}
class Dog extends  Animal{
    void ani2(){
        System.out.println("I am a dog");
    }
}
public class ex2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.being();
        dog.ani1();
        dog.ani2();
    }
    
}
