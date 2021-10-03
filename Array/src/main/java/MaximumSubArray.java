
public class MaximumSubArray {
    public static void main(String[] args) {
        //-5 1 -2 3 -1 2 -2
        //-3 8 -2 4 -5 6
        //maxEnding -3 8 6 10 5 11
        //res -3 8 8 10 10 11
    }

    //time complexity O(n)
    private static int maximumSumSubArray(int[] arr){
        int res = arr[0], maxEnding = arr[0];
        for(int i=1; i<arr.length;i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}
