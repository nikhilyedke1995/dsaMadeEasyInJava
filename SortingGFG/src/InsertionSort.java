import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        /**
         * time complexity worst case o(n2)
         * in place and stable
         * used in practise for small arrays (tim sort and introsort)
         * o(n) best case
         */
        printInsertionSortedArray(new int[]{20,5,40,60,10,30});
    }

    private static void printInsertionSortedArray(int[] arr){
        for(int i=1; i< arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

}
