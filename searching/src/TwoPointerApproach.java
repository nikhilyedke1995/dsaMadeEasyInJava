
public class TwoPointerApproach {

    public static void main(String[] args) {
        int[] arr = {2,3,4,8,9,20,40};
        /**
         *given an sorted array and a number x,
         * we need to find if there is a pair in the array with the sum equals to x
         *
         * we can use hashing as usual in this, but it need O(n) space, so we are using
         * two pointers approach
         *time need O(n), space O(1)
         */
        System.out.println(isPairAvailable(arr,0, arr.length -1,17));
        /**
         * find a triplet in sorted array: generally it will take O(n^3) time  but
         * using our technique it will take O(n2) time
         *
         * if we use this approach on unsorted array still it will take O(n2) time as sorting
         * need O(NlogN) time
         */
        System.out.println(isTripletAvailable(arr,57));
        /**
         * TODO: count pairs with given sum
         * TODO: count triplets with given sum
         * TODO: find if there is a triplet a,b,c such that a2+b2=c2
         */
    }

    private static boolean isPairAvailable(int[] arr,int left,int right, int x){
        while(left<right){
            int temp = arr[left] + arr[right];
            if(temp==x)
                return true;
            else if (temp>x)
                    right--;
            else
                left++;
        }

        return false;
    }

    private static boolean isTripletAvailable(int[] arr,int x){
        for(int i=0; i<arr.length; i++){
            if(isPairAvailable(arr,i+1, arr.length-1,x-arr[i]))
                return true;
        }
        return false;
    }
}
