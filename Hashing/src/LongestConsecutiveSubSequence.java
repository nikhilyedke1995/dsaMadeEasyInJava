import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubSequence {
    public static void main(String[] args) {
        int[] arr = {1,3,9,2,8,2};
        System.out.println(longestSub(arr));
    }

    private static int longestSub(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        }

        int res = 1;
        for(Integer x : set){
            if(!set.contains(x-1)){
                int curr = 1;
                while (set.contains(x+curr))
                    curr++;
                res = Math.max(res,curr);
            }
        }
        return res;
    }
}
