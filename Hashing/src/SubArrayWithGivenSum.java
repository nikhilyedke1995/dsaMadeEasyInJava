import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {5,3,2,-1};
        int sum = 4;
        System.out.println(isSum(arr,sum));
    }

    //time complexity O(n)
    private static boolean isSum(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();
        int pre_sum = 0;
        for(int x : arr){
            pre_sum += x;
            if(pre_sum == sum)
                return true;
            if(set.contains(pre_sum-sum))
                return true;
            set.add(pre_sum);
        }
        return false;
    }
}
