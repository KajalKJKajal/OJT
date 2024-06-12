// Create a basic inheritance structure where a superclass vehicle has a 
// method to display the type of vehicle and a subclass Car extends vehicle 
class Vehicle {
    void displayType() {
        System.out.println("This is a vehicle.");
    }
}
class Car extends Vehicle {
    void displayBrand(String brand) {
        System.out.println("This is a " + brand + " car.");
    }
}

public class ex1 {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.displayType();
        mycar.displayBrand("Toyota");
    }
}

