package bubble;

import java.util.Arrays;

/**
 * in this every element will compare with this adjecent element
 * it means on every phase largest element reach their actual position
 * algo-: loop always less run one less then array size because on every phase largest element occupied its correct position
 */
public class BubbleSort_Q_1 {

    public static void main(String[] args) {

        int[] unsorted = {3, 1, 5, 4, 2};

        //this loop will define that how many phase it will to  sort this array
        for (int i = unsorted.length - 1; i > 0; i--) {
            //this will send largest element to it's correct position and this
            for (int j = 0; j < i; j++) {
                if (unsorted[j] > unsorted[j + 1]) {
                    swap(unsorted, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(unsorted));
    }

    private static void swap(int[] a, int i, int i1) {
        int temp = a[i];
        a[i] = i1;
        a[i1] = temp;
    }
}
