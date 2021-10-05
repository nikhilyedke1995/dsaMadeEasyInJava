public class AllocateMinimumNoOfPages {
    public static void main(String[] args) {
        int []arr = {12,34,67,90};
        System.out.println("minimum no of pages to read " + minimumNoOfPages(arr,2));
    }

    /**
     *
     * @param arr pages of different books
     * @param k number of students
     * @return minimum pages a student has to read
     */
    public static int minimumNoOfPages(int []arr, int k){
        int sum = 0, mx = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            mx = Math.max(mx,arr[i]);
        }

        int low = mx, high =sum, res = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isFeasible(arr,k,mid)){
                res=mid;        //if feasible go to left half
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return res;
    }

    public static boolean isFeasible(int[] arr,int k, int ans){
        int req = 1,sum = 0;
        for (int j : arr) {
            if (sum + j > ans) {
                req++;
                sum = j;
            } else
                sum += j;
        }
        return req<=k;
    }
}
