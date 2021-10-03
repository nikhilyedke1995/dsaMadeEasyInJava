
public class MaximumDifference {
    public static void main(String[] args) {
        //maximum difference of arr[j] - arr[i], such that j>i
        int[] arr = {2,3,10,6,4,8,1};
        int res = arr[1] - arr[0], minVal = arr[0];
        for(int j=1;j<arr.length; j++){
            res = Math.max(arr[j]-minVal,res);
            minVal = Math.min(minVal,arr[j]);
        }
        System.out.println(res);
    }


}
