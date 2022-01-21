import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountOfDistinctElementInAnArray {

    public static void main(String[] args) {
        int[] k = {10,20,10,30,20,20,10,10,40};
        Set<Integer> set = new HashSet<>();
        for(int l : k) set.add(l);
        System.out.println(set.size());
    }

}
