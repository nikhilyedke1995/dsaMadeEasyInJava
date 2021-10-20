import java.util.Arrays;

public class MinimumDifferenceInAnArray {
    public static void main(String[] args) {
        int[] arr = {10,3,20,12};
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++)
            res = Math.min(res, arr[i]-arr[i-1]);

        System.out.println(res);
    }
}
