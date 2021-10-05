public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        // 10,20,30
        //5,15,25,35,45
        System.out.println(getMedian(new int[]{10,20,30},new int[]{5,15,25,35,45}));
        //1,2,3
        //4,5,6,7
        System.out.println(getMedian(new int[]{1,2,3},new int[]{4,5,6,7}));
    }

    private static double getMedian(int[] a1, int[] a2){
        int begin = 0, end = a1.length;
        while(begin<=end){
            int i1 = (begin+end)/2;
            int i2 = (a1.length+a2.length+1)/2-i1;
            int min1 = (i1==a1.length)?Integer.MAX_VALUE:a1[i1];
            int min2 = (i2==a2.length)?Integer.MAX_VALUE:a2[i2];
            int max1 = (i1==0)?Integer.MIN_VALUE:a1[i1-1];
            int max2 = (i2==0)?Integer.MIN_VALUE:a2[i2-1];
            if(max1<=min2 && max2<=min1){
                if((a1.length+a2.length)%2==0)
                    return (double)(Math.max(max1,max2) + Math.min(min1,min2))/2;
                else
                    return (double) Math.max(max1,max2);
            }
            if(max1>min2) end = i1-1;
            else begin=i1+1;
        }
        return 0.0;
    }
}
