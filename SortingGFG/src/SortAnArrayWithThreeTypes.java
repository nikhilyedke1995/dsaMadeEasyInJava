import java.util.Arrays;

public class SortAnArrayWithThreeTypes {
    /**
     * Sort an array of 0s 1s 2s
     * arr[] = {0,1,0,2,1,2}
     *
     * Three way partitioning
     * arr[] = {2,1,2,20,10,20,1}
     *
     * partition around a range
     * arr[] = {10,5,6,3,20,9,40}
     * range = [5 10]
     */

    /**
     * Dutch national flag algorithm
     */
    public static void main(String[] args) {
        SortAnArrayWithThreeTypes types = new SortAnArrayWithThreeTypes();
        int[] arr = {0,1,0,2,1,2};
        types.sort(arr);
    }

    void sort(int[] arr){
        int low = 0, mid = 0, high = arr.length -1;
        while (mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
