// Define a Soundable interface with a method 'makeSound'
interface Soundable {
    void makeSound();  // Abstract method to be implemented by implementing classes
}

// Main class to demonstrate a Dog implementing the Soundable interface using an anonymous class
public class InterfaceExample {
    public static void main(String[] args) {
        // Implementing Dog directly using an anonymous class
        Soundable dog = new Soundable() {
            @Override
            public void makeSound() {
                System.out.println("Dog says: Woof woof!");  // Implementation of makeSound method for Dog
            }
        };

        dog.makeSound();  // Call the makeSound method, polymorphically invoking Dog's sound
    }
}
