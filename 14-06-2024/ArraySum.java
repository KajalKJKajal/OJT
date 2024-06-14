import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  // Example array
        int sum = Arrays.stream(arr).sum();  // Calculate sum using Arrays.stream() and sum()
        System.out.println("Sum of array elements: " + sum);  // Print the sum
    }
}
