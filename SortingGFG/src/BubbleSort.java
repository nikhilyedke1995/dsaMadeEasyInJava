import java.util.Arrays;

public class BubbleSort {

    //time complexity O(n2)
    public static void main(String[] args) {
        printBubbleSortedArray(new int[]{10,8,20,5});
    }

    private static void printBubbleSortedArray(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean unswap = true;
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    unswap = false;
                }
            }
            if (unswap)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
