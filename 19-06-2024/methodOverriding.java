class Animal{
    void makesound(){
        System.out.println("the animal makes sound");
    }
}
class dog extends Animal{
    @Override
    void makesound(){
        System.out.println("the dog barks");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dogs = new dog();
        animal.makesound();
        dogs.makesound();
    }
}