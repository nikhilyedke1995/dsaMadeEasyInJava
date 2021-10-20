
public class UnionOfTwoArray {
    public static void main(String[] args) {
        unionOfTwoSortedArray(new int[]{10,20,20},new int[]{5,20,20,40,40});
    }

    private static void unionOfTwoSortedArray(int[] a, int[] b){
        int i = 0, j = 0;
        while(i<a.length && j<b.length){
            if(i>0 && a[i]==a[i-1]) {
                i++;
                continue;
            }

            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }

            if(a[i]<b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if(a[i]>b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else{
                System.out.print(a[i]+" ");
                i++; j++;
            }
        }
        while (i<a.length) {
            if (i > 0 && a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
            }
            i++;
        }

        while (j<b.length) {
            if (j > 0 && b[j] != b[j - 1]) {
                System.out.print(b[j] + " ");
            }
            j++;
        }
        System.out.println();
    }
}
