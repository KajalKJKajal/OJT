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
class cat extends Animal{
    @Override
    void makesound(){
        System.out.println("Meow Meow");
    }
}
class cow extends Animal{
    @Override
    void makesound(){
        System.out.println("moo moo");
    }
}
public class main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Animal();
        animals[1] = new dog();
        animals[2]= new cat();
        animals[3] = new cow();
        for(Animal animal : animals){
            animal.makesound();
        }
    }
}