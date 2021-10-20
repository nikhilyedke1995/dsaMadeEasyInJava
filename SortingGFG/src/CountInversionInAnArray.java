public class CountInversionInAnArray {
    public static void main(String[] args) {
        System.out.println(merge(new int[]{2,4,1,3,5},0,4));
        System.out.println(merge(new int[]{40,30,20,10},0,3));
    }

    private static int merge(int[] arr, int l, int r){
        int res = 0;
        if(l<r){
            int m = l + (r-l)/2;
            res += merge(arr,l,m);
            res += merge(arr,m+1,r);
            res += countAndMerge(arr,l,m,r);
        }
        return res;
    }

    private static int countAndMerge(int[] arr, int l, int m, int r){
        int n1 = m-l+1, n2= r-m;
        int[] left = new int[n1], right = new int[n2];
        for(int i=0; i<n1; i++)
            left[i] = arr[l+i];
        for(int i=0; i<n2; i++)
            right[i] = arr[m+1+i];
        int res = 0, i =0, j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i++];
            }else{
                arr[k] = right[j++];
                res += (n1-i);
            }
            k++;
        }
        while(i<n1)
            arr[k++] = left[i++];

        while(j<n2)
            arr[k++] = right[j++];

        return res;
    }
}
