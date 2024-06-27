public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println(result.length > 0 ? "Indices: " + result[0] + ", " + result[1] : "No solution found");
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int left = 0, right = numbers.length - 1; left < right; ) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) return new int[]{left + 1, right + 1};
            if (sum < target) left++;
            else right--;
        }
        return new int[]{};
    }
}
