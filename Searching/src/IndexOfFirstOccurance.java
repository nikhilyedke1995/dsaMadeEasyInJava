public class IndexOfFirstOccurance {
    public static void main(String[] args) {
        int[] arr = {5,10,10,15,20,20,20};
        System.out.println("first occurrence of 5 is " + searchFirstIndexRecursive(arr,0,6,5));
        System.out.println("first occurrence of 5 is " + searchFirstIndexIterative(arr,5));
        System.out.println("first occurrence of 5 is " + searchFirstIndexIterative(arr,4));

        System.out.println("last index of 20 is " + searchLastIndexRecursive(arr,0,arr.length-1,20));
        System.out.println("last index of 20 is " + searchLastIndexIterative(arr,20));
        System.out.println("last index of 25 is " + searchLastIndexIterative(arr,25));
        System.out.println("last index of 4 is " + searchLastIndexIterative(arr,4));

        System.out.println("count of 20 is " + countOccur(arr,20));

        System.out.println("count of 1s in binary array " + countOnes(new int[]{0,0,0,1,1,1,1,1,1}));
        System.out.println("count of 1s in binary array " + countOnes(new int[]{1,1,1,1,1,1}));
        System.out.println("count of 1s in binary array " + countOnes(new int[]{0,0,0}));
    }

    private static int searchFirstIndexRecursive(int[] arr, int low, int high,int x){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid]>x)
            return searchFirstIndexRecursive(arr,low,mid-1,x);
        else if(arr[mid]<x)
            return searchFirstIndexRecursive(arr,mid+1,high,x);
        else if(mid==0 || arr[mid-1]!=arr[mid])
            return mid;
        else
            return searchFirstIndexRecursive(arr,low,mid-1,x);
    }

    private static int searchFirstIndexIterative(int[] arr, int x){
        int low = 0, high = arr.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x)
                high = mid - 1;
            else if(arr[mid]<x)
                low = mid + 1;
            else if(mid==0 || arr[mid-1]!=arr[mid])
                return mid;
            else
                high = mid-1;
        }
            return -1;
    }

    private static int searchLastIndexRecursive(int[] arr, int low, int high, int x){
        if (low>high) return -1;
        int mid = (low+high)/2;
        if(arr[mid]>x)
            return searchLastIndexRecursive(arr,low,mid-1,x);
        else if(arr[mid]<x)
            return searchLastIndexRecursive(arr,mid+1,high,x);
        else if(mid == arr.length-1 || arr[mid]!=arr[mid+1])
            return mid;
        else
            return searchLastIndexRecursive(arr,mid+1,high,x);
    }

    private static int searchLastIndexIterative(int[] arr,int x){
        int low = 0, high = arr.length -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x)
                high = mid - 1;
            else if(arr[mid]<x)
                low = mid + 1;
            else if(mid==arr.length-1 || arr[mid+1]!=arr[mid])
                return mid;
            else
                low = mid+1;
        }
        return -1;
    }

    private static int countOccur(int[] arr, int x){
        int first = searchFirstIndexIterative(arr,x);
        if(first == -1)
            return 0;
        else
            return (searchLastIndexIterative(arr,x)-first+1);
    }

    private static int countOnes(int[] arr){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==0)
                low = mid + 1;
            else if(mid == 0 || arr[mid -1 ]==0)
                return (arr.length - mid);
            else
                high = mid - 1;
        }
        return 0;
    }
}
