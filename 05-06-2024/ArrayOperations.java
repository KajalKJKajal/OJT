
// import java.util.Arrays;
// import java.util.Collections;

// public class    ArrayOperations {
//     public static void main(String[] args) {
//        Integer[] num={1,3,4,2,6};
//         System.out.println(Arrays.binarySearch(num,4));
//         // System.out.println(Arrays.stream(num).max());
//         Arrays.sort(num,Collections.reverseOrder());
//         for(int i :num){
//         System.out.print(i);
//         // Collections are used to store, retrieve, manipulate, and communicate aggregate data. 
        

        
        
//   }
//    }  
//     }
    
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2, 9, 3, 7, 5, 8};

        // Removing duplicates using Stream API
        int[] uniqueArray = removeDuplicates(array);

        // Displaying the array without duplicates
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        // Use IntStream to filter out duplicates
        return IntStream.of(array)
                        .distinct()
                        .toArray();
    }
}


