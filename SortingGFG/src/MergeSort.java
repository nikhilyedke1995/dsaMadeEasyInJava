import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        /**
         * Divide and conquer algorithm
         * stable algo
         * O(nlogn)time and O(n) aux space
         * well suited for linked list works in O(1) aux space
         * used in external sorting
         * In general for arrays, quicksort outperformed mergeSort
         */
        printTwoSortedArrayInSortedOrder(new int[]{10,15,20,20},new int[]{1,12});

        System.out.println(Arrays.toString(merge(new int[]{10,20,40,20,30},0,2,4)));
        int[] arr = {10,5,30,15,7};
        mergeSort(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if(l<r){
            int m = l + (r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }

    public static void printTwoSortedArrayInSortedOrder(int[] a, int[] b){
        int i = 0, j= 0;
        while(i<a.length && j<b.length){
            if(a[i]>=b[j]){
                System.out.print(b[j] + " ");
                ++j;
            }else{
                System.out.print(a[i] + " ");
                ++i;
            }
        }

        while(i<a.length){
            System.out.print(a[i] + " ");
            ++i;
        }

        while (j<b.length){
            System.out.print(b[j] + " ");
            ++j;
        }
    }

    private static int[] merge(int[] a, int low, int mid, int high){
        int n1 = mid-low+1, n2 = high-mid;
        int[] left = new int[n1], right = new int[n2];
        for(int i=0; i<n1; i++)
            left[i] = a[low+i];
        for(int i=0; i<n2; i++)
            right[i] = a[mid+i+1];

        int i=0, j=0,k=0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                a[k++] = left[i++];
            } else {
                a[k++]=right[j++];
            }
        }
        while(i<n1) a[k++] = left[i++];
        while(j<n2) a[k++] = right[j++];

        return a;
    }
}

