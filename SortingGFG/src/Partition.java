import java.util.Arrays;

public class Partition {
    public static void main(String[] args) {
        int[] arr = {10,80,30,90,40,50,70};
        Partition partition = new Partition();
        System.out.println(partition.partition(arr,0,arr.length-1,5));
        System.out.println(partition.lPartition(arr,0,arr.length-1));
        System.out.println(partition.hoarsePartition(arr,0,arr.length-1));
    }

    //needs pivot as input
    public int partition(int[] arr, int l, int h, int p){
        int[] temp = new int[h-l+1];
        int index = 0;
        for(int i=l; i<=h; i++){
            if(arr[i]<arr[p]){
                temp[index++] = arr[i];
            }
        }

        for(int i=l; i<=h; i++){
            if(arr[i]==arr[p]){
                temp[index++] = arr[i];
            }
        }

        int res = l+index-1;
        for(int i=l; i<=h; i++){
            if(arr[i]>arr[p]){
                temp[index++] = arr[i];
            }
        }

        for(int i=l; i<=h; i++){
            arr[i] = temp[i-l];
        }
        return res;
    }

    //considering pivot is last element
    //Lomuto partion
    //if pivot is not in end, move it to end and do partion
    public int lPartition(int[] arr, int l, int h){
        int pivot = arr[h];
        int pIndex = l;
        for(int i=l; i<h; i++){
            if(arr[i]<pivot){
                //swap first
                swap(arr,i,pIndex);
                pIndex++;
            }
        }
        swap(arr,pIndex,h);
        System.out.println(Arrays.toString(arr));
        return pIndex;
    }

    //hoarse partition
    public int hoarsePartition(int[] arr, int l, int h){
        int pivot = arr[l];
        int i = l-1, j = h+1;
        while(true){
            do {
                i++;
            }while (arr[i]<pivot);

            do {
                j--;
            }while (arr[j]>pivot);

            if(i>=j) {
                System.out.println(Arrays.toString(arr));
                return j;
            }
            swap(arr,i,j);
        }
    }

    private static void swap(int[] a, int i, int pIndex) {
        int temp = a[i];
        a[i] = a[pIndex];
        a[pIndex] = temp;
    }
}
