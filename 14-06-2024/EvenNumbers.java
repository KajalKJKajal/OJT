public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  // Example array of numbers
        for (int num : numbers) if (num % 2 == 0) System.out.print(num + " ");  // Print even numbers
    }
}
