
public class MaximumConsecutiveOneInBinaryArray {
    public static void main(String[] args) {
        //0 1 1 1 0 1 1
        System.out.println(myApproach(new int[]{0,1,1,1,0,1,1,1,1}));
    }

    //
    private static int myApproach(int[] arr){
        int res=0,curr=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==0)
                curr=0;
            else{
                curr++;
                res = Math.max(res,curr);
            }
        }
        return res;
    }
}
