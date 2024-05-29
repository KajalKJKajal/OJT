public class Calculator {

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero is not allowed.");
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(add(15.5, 5.5));       
        System.out.println(subtract(15.5, 5.5)); 
        System.out.println(multiply(15.5, 5.5)); 
        System.out.println(divide(15.5, 5.5));    

        try {
            divide(15.5, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
