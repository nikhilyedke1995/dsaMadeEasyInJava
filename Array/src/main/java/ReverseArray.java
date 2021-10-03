import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{10})));
        System.out.println(Arrays.toString(reverseArray(new int[]{10, 20})));
        System.out.println(Arrays.toString(reverseArray(new int[]{10, 20, 30})));
        System.out.println(Arrays.toString(reverseArray(new int[]{10, 30, 20, 40})));
    }

    private static int[] reverseArray(int[] a){
       int low = 0, high = a.length - 1;
       while(low<high){
           a[low] = a[low] + a[high];
           a[high] = a[low] - a[high];
           a[low] = a[low] - a[high];
           low++;
           high--;
       }
        return a;
    }
}
