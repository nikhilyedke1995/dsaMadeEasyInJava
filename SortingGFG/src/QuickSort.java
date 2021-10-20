import java.util.Arrays;

public class QuickSort {

    private Partition partition = new Partition();

    /**
     * Time:
     * on average nLogn
     * worst case n2
     *
     * Space:
     * worst case O(n)
     * @param args
     */
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {8,4,7,9,3,10,5};
        quickSort.sortUsingLomutoAlgorithm(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{8,4,7,9,3,10,5};
        quickSort.sortUsingHoarsePartition(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public void sortUsingLomutoAlgorithm(int[] arr,int low, int high){
        if(low<high){
            int p = partition.lPartition(arr,low,high);
            sortUsingLomutoAlgorithm(arr,low,p-1);
            sortUsingLomutoAlgorithm(arr,p+1,high);
        }
    }

    public void sortUsingHoarsePartition(int[] arr, int l, int h){
        if(l<h){
            int p = partition.hoarsePartition(arr,l,h);
            sortUsingHoarsePartition(arr,l,p);
            sortUsingHoarsePartition(arr,p+1,h);
        }
    }
}
