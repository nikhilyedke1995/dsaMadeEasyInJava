
public class WindowSliding {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,3,8,7,6};
        //find sub array of size k which have maximum sum
        System.out.println(maxSubArraySum(arr,3));
        // given an unsorted array of non-negative integers, find if there is a sub array with given sum
        System.out.println(subArrayWithGivenSum(arr,17));
        //todo N-bonacci Numbers, print first M N-bonacci number

        //todo count distinct elements in every window of size k {1,2,1,3,4,3,3} => 3 4 3 2 for 4
    }

    private static int maxSubArraySum(int[] arr,int k) {
        int sum = 0, res = 0;
        for (int i = 0; i < k; i++)
            sum += arr[i];
        res = sum;
        for (int i = k; i < arr.length; i++){
            sum = sum + arr[i] - arr[i-k];
            res = Math.max(res, sum);
        }
        return res;
    }

    private static boolean subArrayWithGivenSum(int[] arr, int sum){
        int curr_sum = arr[0], start = 0;
        for(int i=1; i<arr.length; i++){
            while(curr_sum>sum && start<i-1){
                curr_sum -= arr[start];
                start++;
            }
            if(curr_sum == sum)
                return true;
            curr_sum += arr[i];
        }
        return curr_sum == sum;
    }
}
