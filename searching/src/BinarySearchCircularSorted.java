
public class BinarySearchCircularSorted {
    public static void main(String[] args) {
        int[] arr = {10,20,40,60,100,5,8};
        System.out.println("index of 8 is at " + search(arr,5));
        System.out.println("index of 20 is at " + search(arr,20));
        System.out.println("index of 100 is at " + search(arr,100));
    }

    private static int search(int[] arr,int x){
        int low =0, high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x) return mid;
            if(arr[mid]<x){
                if(arr[mid]<x && arr[high]>=x)
                    low = mid + 1;
                else
                    high = mid - 1;
            }else{
                if(arr[mid]>x && arr[low]<=x)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
}
