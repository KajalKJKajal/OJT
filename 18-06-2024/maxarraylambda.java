import java.util.Arrays;

public class maxarraylambda {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 99, 6};

        int max = Arrays.stream(numbers).max().orElseThrow();

        System.out.println("Maximum element: " + max);
    }
}
