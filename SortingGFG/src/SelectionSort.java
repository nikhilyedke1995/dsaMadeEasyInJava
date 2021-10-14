import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        /**
         * O(n2) time complexity
         * does less memory writes compared to quicksort, mergesort, insertion sort.
         * but cycle sort is optimal in terms of memory writes.
         * not stable
         */
        printSelectionSortedArray(new int[]{10,5,8,20,2,18});
    }

    private static void printSelectionSortedArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            int max = i;
            boolean findMax = false;
            for (int j=0; j< arr.length-i; j++){
                if(arr[max]<arr[j]) {
                    max = j;
                    findMax = true;
                }
            }
            if(findMax) {
                int temp = arr[max];
                arr[max] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            } else
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
