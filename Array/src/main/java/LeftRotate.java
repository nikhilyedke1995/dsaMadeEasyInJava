import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRotateByOne(new int[]{1, 2, 3, 4, 5})));

        //rotate the array by nth position
        //rotate by 3 - naive approach time complexity O(N*D)
        int[] ans = new int[]{1, 2, 3, 4, 5};
        for(int i=0; i<3; i++)
            leftRotateByOne(ans);
        System.out.println(Arrays.toString(ans));

        //rotate by three time complexity O(n) space complexity O(d)
        System.out.println(Arrays.toString(leftRotateKthTimeAuxilarySpace(new int[]{1,2,3,4,5},3)));

        //rotate using reverse time complexity O(n) and auxiliary space O(1)
        ans = new int[]{1, 2, 3, 4, 5};
        leftRotateKthTimeUsingReverse(ans,3);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] leftRotateByOne(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++)
            arr[i-1] = arr[i];
        arr[arr.length-1] = temp;
        return arr;
    }

    private static int[] leftRotateKthTimeAuxilarySpace(int[] arr, int k){
        int[] d = new int[k];
        for(int i=0; i<k; i++)
            d[i] = arr[i];
        for(int i = k; i<arr.length; i++)
            arr[i-k] = arr[i];
        for(int i=0; i<k; i++)
            arr[arr.length - k + i] = d[i];
        return arr;
    }

    private static void leftRotateKthTimeUsingReverse(int[] arr, int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
