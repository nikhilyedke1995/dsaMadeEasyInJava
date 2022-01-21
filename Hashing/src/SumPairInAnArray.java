import java.util.HashSet;
import java.util.Set;

public class SumPairInAnArray {

    public static void main(String[] args) {
        int[] arr = {8,3,4,2,5};
        int sum = 6;
        System.out.println(isPair(arr,sum));
    }

    private static boolean isPair(int[] arr, int sum) {
        Set<Integer> h = new HashSet<>();
        for(int k : arr)
            if(h.contains(sum-k))
                return true;
            else
                h.add(k);
        return false;
    }

}
