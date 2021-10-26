import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new RadixSort().radixSort(new int[] {319,212,6,8,100,50})));
    }

    int[] radixSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr)
            max = Math.max(i,max);
        for(int exp = 1; max/exp>0; exp=exp*10)
            countingSort(arr, arr.length,exp);
        return arr;
    }

    private void countingSort(int[] arr, int n, int k){
        int[] count = new int[10];
        int[] output = new int[n];
        Arrays.fill(count,0);
        for(int i=0; i<n; i++)
            count[(arr[i]/k)%10]++;
        for(int i=1; i<10; i++)
            count[i]+=count[i-1];
        for(int i=n-1; i>=0; i--){
            output[count[(arr[i]/k)%10]-1] = arr[i];
            count[(arr[i]/k)%10]--;
        }
        for(int i=0; i<n; i++)
            arr[i] = output[i];
    }
}
