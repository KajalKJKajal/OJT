import java.util.Arrays;

public class SquareOfArrayElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int[] squaredNumbers = Arrays.stream(numbers)
                                     .map(n -> n * n)
                                     .toArray();

        System.out.println("Squared numbers: " + Arrays.toString(squaredNumbers));
    }
}
