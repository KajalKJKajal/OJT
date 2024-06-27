public class MedianOfTwoSortedArrays {
    public static double findMedian(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy the remaining elements from nums1, if any
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }

        // Copy the remaining elements from nums2, if any
        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }

        // Find the median
        int n = merged.length;
        if (n % 2 == 0) {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        } else {
            return merged[n / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        double median = findMedian(nums1, nums2);
        System.out.println("Median: " + median); // Output: 3.5
    }
}