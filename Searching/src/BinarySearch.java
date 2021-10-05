import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        System.out.println("10 is at " + bSearch(arr,10));
        System.out.println("40 is at " + bSearch(arr,40));
        System.out.println("60 is at " + bSearch(arr,60));

        System.out.println("Using Recursive 10 is at " + bSearchRecursive(arr,0,6,10));
        System.out.println("Using Recursive 40 is at " + bSearchRecursive(arr,0,6,40));
        System.out.println("Using Recursive 60 is at " + bSearchRecursive(arr,0,6,60));
        System.out.println("Using Recursive 60 is at " + bSearchRecursive(arr,0,6,80));
        int[] infiArray = new int[100000];
        for(int i=0; i<100000; i++){
            infiArray[i] = (int) (Math.random() * i);
        }
        Arrays.sort(infiArray);
        System.out.println("searching " + infiArray[12355] + " in infinite array at index " + search(infiArray,infiArray[12355]));
    }

    //time complexity logN space complexity O(1)
    private static int bSearch(int []arr, int x){
        int low =0, high = arr.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]>x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    //time complexity logN need space for function call stacks space O(logN)
    private static int bSearchRecursive(int[] arr, int low, int high, int x){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid]==x)
            return mid;
        if(arr[mid]>x)
            return bSearchRecursive(arr,low,mid - 1, x);
        else
            return bSearchRecursive(arr,mid+1,high,x);
    }

    //search element in infinite array or array with max length
    private static int search(int[] arr, int x){
        if(arr[0]==x) return 0;
        int i=1;
        while(arr[i]<x)
            i = i*2;
        if(arr[i]==x) return i;
        return bSearchRecursive(arr,i/2+1,i-1,x);
    }
}
