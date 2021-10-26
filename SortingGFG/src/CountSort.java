import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {1,4,4,1,0,1};
        new CountSort().countSort(arr,5);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{5,6,5,2};
        new CountSort().countSort(arr,7);
        System.out.println(Arrays.toString(arr));
    }

    public void countSort(int[] arr, int k){
        int[] count = new int[k];
        Arrays.fill(count,0);
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        for(int i=1;i<k;i++)
            count[i]=count[i-1]+count[i];
        int[] output = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        for(int i=0; i<arr.length; i++)
            arr[i] = output[i];
    }

}
