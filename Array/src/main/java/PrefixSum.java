import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrefixSum {
    public static void main(String[] args) {
        /**given a fixed array and multiple queries of following
         * types on the array, how to effectively perform the query
         * {2,8,3,9,6,5,4}
         */
        System.out.println(Arrays.toString(multipleAdditionQueries(new int[]{2,8,3,9,6,5,4})));
        /**
         * Given an array if integers, find if it has an equilibrium point
         */
        System.out.println(findEquilibriumPoint(new int[]{4,2,-2}));
        /**
         * Given n ranges, find the maximum appearing element in the ranges
         */
        System.out.println(maxOcc(new int[]{1,2,3},new int[]{3,5,7}));

        /**
         * TODO: check if array can be divided into three parts with equal sum
         */
        /**
         *  TODO: check if there is a sub array with 0 sum
         */
        /**
         * TODO: find the longest sub array with equal 0s and 1s
         */
    }

    private static int[] multipleAdditionQueries(int arr[]){
        int[][] queries = {{0,2},{1,4},{2,6}};
        int[] ans = new int[queries.length];
        for(int i=1 ; i<arr.length; i++)
           arr[i] = arr[i] + arr[i-1];
        for(int i=0; i<queries.length; i++){
            if(queries[i][0]!=0)
                ans[i] = arr[queries[i][1]]-arr[queries[i][0]-1];
            else
                ans[i] = arr[queries[i][1]];
        }
        return ans;
    }

    private static boolean findEquilibriumPoint(int[] arr){
        int sum = 0;
        for(int i : arr)
            sum += i;
        int l_sum = 0;
        for(int i=0; i<arr.length; i++){
            if(l_sum==sum-arr[i])
                return true;
            l_sum += arr[i];
            sum -= arr[i];
        }
        return false;
    }

    //solution for 0<= L[i]R[i]<=1000 such that i=>0 to length-1
    private static int maxOcc(int[] L, int[] R){
        int[] arr = new int[1000];
        for(int i=0; i<L.length; i++){
            arr[L[i]]++;
            arr[R[i]+1]--;
        }
        int maxm = arr[0], res = 0;
        for(int i=1; i<1000; i++){
            arr[i]+= arr[i-1];
            if(maxm < arr[i]){
                maxm = arr[i];
                res = i;
            }
        }
        return res;
    }
}
