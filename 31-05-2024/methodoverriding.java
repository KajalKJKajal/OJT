public class methodoverriding {
    public static void main(String[] args){
        Animal animal = new Animal();
        // Dog dg = new Dog();
        // Dog d = new Dog();
        animal.Sound();
        // dg.Sound();
        
    }
}
class Animal{
    public void Sound()
    {
        System.out.println("Meow");
    }
class Dog extends Animal{
    public void Sound()
    {
        System.out.println("Bow");
    }
}
}
