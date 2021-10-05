import java.util.Arrays;

public class PeakElement {
    public static void main(String[] args) {
        //not smaller than the neighbour
        int[] arr = {5,20,40,30,20,50,60};
        System.out.println("one of pick of an array " + Arrays.toString(arr) + " is at " + getPeak(arr));
    }

    private static int getPeak(int[] arr){
        int low = 0, high = arr.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if( (mid==0 || arr[mid-1]<=arr[mid]) && (mid== arr.length-1 || arr[mid+1]<=arr[mid]))
                return mid;
            if(mid > 0 && arr[mid]<=arr[mid-1])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
