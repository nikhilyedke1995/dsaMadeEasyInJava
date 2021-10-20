
public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        intersectionOfTwoSortedArray(new int[]{10,20,20,40,60},new int[]{2,20,20,20});
    }

    private static void intersectionOfTwoSortedArray(int[] a, int[] b){
        int i = 0, j = 0;
        while(i<a.length && j<b.length){
            if(i>0 && a[i]==a[i-1]) {
                i++;
                continue;
            }

            if(a[i]<b[j])
                i++;
            else if(a[i]>b[j])
                j++;
            else{
                System.out.print(a[i] + " ");
                i++; j++;
            }
        }

        System.out.println();
    }
}
