import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new BucketSort().sort(new int[]{30,40,10,80,5,12,70},4)));
    }

    //here bucket size is already provided
    int[] sort(int[] arr, int k){
        int n = arr.length;
        //calculate max from the array first
        int max = Integer.MIN_VALUE;
        for(int i : arr)
            max = Math.max(max, i);
        max++;
        //now make buckets
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>();
        for(int i=0; i<k; i++)
            bucket.add(new ArrayList<Integer>());
        for(int i=0; i<n; i++)
            bucket.get(arr[i]*k/max).add(arr[i]);
        for(int i=0; i<k; i++)
            Collections.sort(bucket.get(i));
        int index = 0;
        for(int i=0; i<k; i++)
            for(int j=0; j<bucket.get(i).size(); j++)
                arr[index++] = bucket.get(i).get(j);

            return arr;
    }
}
