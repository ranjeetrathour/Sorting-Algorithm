package selection;

import java.util.Arrays;

/**
 * in this algorithm we will first find maximum element and than swap that element with last element
 * after swap the last index of the array should not be count it means last element should be last-1
 * step - 1 find max element
 *        2 swap with last index
 *        3 now last index should be arr.length-1-i; (where i it the number of phase or how many times loop iterate)
 */
public class SelectionSort_Q_1 {
    public static void main(String[] args) {
        int arr[] = {4, 13, 6, 9, 1, 44, 11, 2};

        System.out.println("Original Array: " + Arrays.toString(arr));

        sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the maximum element in the unsorted portion of the array
            int maxIndex = getMaxElement(arr, 0, n - 1 - i);

            // Swap the maximum element with the last element of the unsorted portion
            swap(arr, maxIndex, n - 1 - i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int getMaxElement(int[] arr, int start, int last) {
        int maxIndex = start;
        for (int i = start; i <= last; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i; // Update the max index
            }
        }
        return maxIndex;
    }
}
