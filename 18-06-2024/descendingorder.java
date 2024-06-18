import java.util.Arrays;

public class descendingorder {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 3, 1};

        Arrays.sort(numbers, (a, b) -> b - a);

        System.out.println("Array sorted in descending order: " + Arrays.toString(numbers));
    }
}
