import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        /**
         * Given an array of n integers where each value represents the number of chocolates in a packet.
         * Each packet can have a variable number of chocolates.
         * There are m students, the task is to distribute chocolate packets such that:
         * Each student gets one packet.
         * The difference between the number of chocolates in the packet with maximum chocolates and packet
         * with minimum chocolates given to the students is minimum.
         */

        int[] arr = {7,3,2,4,9,12,56};
        ChocolateDistributionProblem ch = new ChocolateDistributionProblem();
        System.out.println(ch.minDiff(arr,3));
    }

    private int minDiff(int[] arr, int m){
        //first check if m>arr.length
        if(m>arr.length)
            return -1;
        //sort the array
        Arrays.sort(arr);
        //initialize result
        int res = arr[m-1] - arr[0];
        for(int i=1; (i+m-1)<arr.length; i++)
            res = Math.min(res,(arr[i+m-1]-arr[i]));
        return res;
    }
}
