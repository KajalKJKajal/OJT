public class Person {
    // Attributes
    String firstName;
    String lastName;
    int age;

    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
    }
}
