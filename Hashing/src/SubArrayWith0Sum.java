import java.util.HashSet;
import java.util.Set;

public class SubArrayWith0Sum {

    public static void main(String[] args) {
        int[] arr = {3,4,3,-1,1};
        System.out.println(is0SubArray(arr));
    }

    //time complexity O(n)
    private static boolean is0SubArray(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int pre_sum = 0;
        for(int k : arr) {
            pre_sum += k;
            if(set.contains(pre_sum))
                return true;
            if(pre_sum==0)
                return true;
            set.add(pre_sum);
        }
        return false;
    }

}
