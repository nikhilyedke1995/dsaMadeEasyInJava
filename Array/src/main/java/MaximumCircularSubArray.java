public class MaximumCircularSubArray {
    public static void main(String[] args) {
        //time complexity = O(n)
        //kadane algorithm
        // -5 -10
        // 8 -4 3 -5 4
        // -8 4 -3 5 -4
        System.out.println(overallMaxSum(new int[]{8,-4,3,-5,4}));
    }

    private static int normalMaxSum(int[] arr){
        int res = arr[0], maxEnding = arr[0];
        for(int i=1; i< arr.length; i++){
            maxEnding = Math.max(arr[i],maxEnding+arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }

    private static int overallMaxSum(int[] arr){
        int max_normal = normalMaxSum(arr);

        if(max_normal<0)
            return max_normal;

        int arr_sum = 0;
        for(int i=0; i<arr.length; i++){
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + normalMaxSum(arr);
        return Math.max(max_normal,max_circular);
    }

}
