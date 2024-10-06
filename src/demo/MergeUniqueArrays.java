package demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


//developer:warkhade

public class MergeUniqueArrays {
    public static void main(String[] args) {
        // Initialize two arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        // Create a Set to hold unique elements from both arrays
        Set<Integer> uniqueSet = new HashSet<>();

        // Add elements from the first array to the set
        for (int num : array1) {
            uniqueSet.add(num);
        }

        // Add elements from the second array to the set
        for (int num : array2) {
            uniqueSet.add(num);
        }

        // Convert the Set to an array
        int[] mergedUniqueArray = uniqueSet.stream().mapToInt(Integer::intValue).toArray();

        // Print the merged array with unique numbers
        System.out.println("Merged Array with Unique Numbers: " + Arrays.toString(mergedUniqueArray));
    }
}