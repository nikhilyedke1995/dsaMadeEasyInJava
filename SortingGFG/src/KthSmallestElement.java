public class KthSmallestElement {

    private Partition partition = new Partition();

    /**
     *     quick select algorithm
     *
     */
    public static void main(String[] args) {
        KthSmallestElement kth = new KthSmallestElement();
        System.out.println(kth.getKthSmallestElement(new int[]{10,4,5,8,11,6,26},5));
    }

    private int getKthSmallestElement(int[] arr, int k){
        int l =0, r = arr.length-1;
        while(l<=r){
            int p = partition.lPartition(arr,l,r);
            if(p==k-1)
                return p;
            else if(p>k-1)
                r = p-1;
            else
                l = p+1;
        }
        return -1;
    }
}
