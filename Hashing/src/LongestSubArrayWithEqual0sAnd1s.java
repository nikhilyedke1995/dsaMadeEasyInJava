import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithEqual0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,0,0};
        System.out.println(maxLen(arr));
    }

    private static int maxLen(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int pre_sum = 0, res = 0;
        for(int i=0; i<arr.length; i++){
            pre_sum += (arr[i]==0?-1:arr[i]);
            if(pre_sum==0)
                res = i+1;
            if(!map.containsKey(pre_sum))
                map.put(pre_sum,i);
            if(map.containsKey(pre_sum))
                res = Math.max(res,i-map.get(pre_sum));
        }
        return res;
    }
}
