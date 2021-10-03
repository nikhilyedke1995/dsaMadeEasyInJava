
public class MaximumLengthEvenOddSubarray {
    public static void main(String[] args) {
        //5,10,20,6,3,8
        System.out.println(getMaxEvenOdd(new int[]{5,10,20,6,3,8}));
    }

    private static int getMaxEvenOdd(int[] arr){
        int res = 1,curr=1;
        for(int i=1; i<arr.length; i++){
            if((arr[i]%2 == 0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
                curr++;
                res = Math.max(res,curr);
            }else{
                curr = 1;
            }
        }
        return res;
    }
}
