package cycle;

import java.util.Arrays;

/**
 * in this just we check that our element is at correct index or not like 5 should be on index 4
 */
public class CycleSort_Q_1 {
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,8,1};
        int i=0;
        while (i<arr.length){
            int correctIndex = arr[i]; //finding correct index of each element
//            System.out.println(arr[correctIndex]);
            if (arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
